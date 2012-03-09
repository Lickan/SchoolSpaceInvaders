package se.kyh.ad10s.spaceInvaders;

import java.util.Map;

import android.content.Context;
import android.content.res.Resources;
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
	public static Resources resources;

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
		
		ship = new Ship(this.screenWidth/2, this.screenHeight - 90, shipBitmap);
		AlienGroup alienGroup = new AlienGroup(getResources());
		alienGroup.createAlienGroup(3, 4, this.screenWidth, this.screenHeight);
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
