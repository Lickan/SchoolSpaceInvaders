package se.kyh.ad10s.spaceInvaders;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Panel extends SurfaceView implements SurfaceHolder.Callback{
	
	public static int screenWidth;
	public static int screenHeight;
	private GameThread thread;
	private Ship ship;
	private Alien alien;

	public Panel(Context context, int screenWidth, int screenHeight){
		super(context);
		getHolder().addCallback(this);
		this.screenWidth = screenWidth;
		this.screenHeight = screenHeight;
		
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inSampleSize = 1/2;
	    Bitmap shipBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.drawing12, options);
	    Bitmap alien1Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.drawing13, options);
	    shipBitmap = Bitmap.createScaledBitmap(shipBitmap, 50, 46, false);
	    alien1Bitmap = Bitmap.createScaledBitmap(alien1Bitmap, 50, 35, false);
//		Bitmap shipBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.drawing12);
		
		ship = new Ship(this.screenWidth/2, this.screenHeight - 90, shipBitmap);
		drawAliens();
	}
	
	public void drawAliens(){
		int amountOfAliens = this.screenWidth / 50;
		int addSpace = 0;
		while(amountOfAliens >= 1){
			
			BitmapFactory.Options options = new BitmapFactory.Options();
			options.inSampleSize = 1/2;
			Bitmap alien1Bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.drawing13, options);
		    alien1Bitmap = Bitmap.createScaledBitmap(alien1Bitmap, 50, 35, false);
			alien = new Alien((this.screenWidth - 50) + addSpace, this.screenHeight / 6, alien1Bitmap);
			addSpace = addSpace + alien1Bitmap.getWidth();
		}
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		int eventX = (int) event.getX();
		int eventAction = event.getAction();
		
		switch (eventAction){
			case MotionEvent.ACTION_MOVE:
				ship.setCenterX(eventX);
				break;
		}
		return true;
	}

	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	public void surfaceCreated(SurfaceHolder holder) {
		thread = new GameThread(getHolder());
		thread.setRunning(true);
		thread.start();
		
	}

	public void surfaceDestroyed(SurfaceHolder holder) {
		boolean retry = true;
		thread.setRunning(false);
		while(retry){
			try {
				thread.join();
				retry = false;
			} catch (InterruptedException e){
				
			}
		}
		
	}

}
