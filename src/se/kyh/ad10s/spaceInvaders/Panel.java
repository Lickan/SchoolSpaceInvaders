package se.kyh.ad10s.spaceInvaders;

import java.util.HashMap;
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
	private Alien alien;
	private Shot shot;
	public static Resources resources;
	public static Map<String, Alien> map = new HashMap<String, Alien>();

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
		drawAliens();
		
	}
	
	 public Map<String, Alien> drawAliens(){	
		 int amountOfAliens = 4;
		 int amountOfRows = 3;
  	
		 

			Map<String, Bitmap> alienBitmaps = new HashMap<String, Bitmap>();
			BitmapFactory.Options options = new BitmapFactory.Options();
			options.inSampleSize = 1/2;
			Bitmap alienBitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.drawing13, options);
			Bitmap alienBitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.drawing14, options);
			Bitmap alienBitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.drawing15);

			alienBitmaps.put("alien1", Bitmap.createScaledBitmap(alienBitmap1, 50, 35, false));
			alienBitmaps.put("alien2", Bitmap.createScaledBitmap(alienBitmap2, 50, 50, false));
			alienBitmaps.put("alien3", Bitmap.createScaledBitmap(alienBitmap3, 50, 50, false));
				
			 String picture;
			 

			for(int x = 1; x <= amountOfRows; x++){	
				int heightPosition = 6-x;
				int addSpace = 0;
				for (int i = 0; i < amountOfAliens; i++) {
					picture = "alien" + (i+1);
					
					map.put("alien" + i + x, new Alien((30) + addSpace, screenHeight / heightPosition, alienBitmaps.get("alien" + x)));

					addSpace = addSpace + alienBitmaps.get("alien1").getWidth();
					
				}
			}
				return map;
	  	
	 }
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		int eventX = (int) event.getX();
		int eventAction = event.getAction();
		
		switch (eventAction){
			case MotionEvent.ACTION_MOVE:
				ship.setCenterX(eventX);
				break;
			case MotionEvent.ACTION_DOWN:
				Bitmap shotBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.shot);
				shot = new Shot(ship.getxPos() + (map.get("alien01").getBitmapWidth()/2), ship.getyPos(), shotBitmap);
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
