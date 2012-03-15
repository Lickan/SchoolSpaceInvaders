package se.kyh.ad10s.spaceInvaders;

import android.graphics.Canvas;
import android.graphics.Color;
import android.view.SurfaceHolder;

public class GameThread extends Thread{
	
	SurfaceHolder surfaceHolder;
	private boolean running;

	public GameThread(SurfaceHolder holder){
		super();
		this.surfaceHolder = holder;
	}

	public void setRunning(boolean running) {
		this.running = running;	
	}

	public void run() {
		Canvas canvas;
		
		while(this.running){
			canvas = null;
			
			try {
				canvas = this.surfaceHolder.lockCanvas(null);
				synchronized (surfaceHolder) {
					canvas.drawColor(Color.BLACK);
					EntityManager.INSTANCE.drawEntities(canvas);
					PointManager.INSTANCE.updateScore(canvas);
					CollisionManager.INSTANCE.collision();
					EntityManager.INSTANCE.checkGame(canvas);
					
					
				}
			} finally {
				if(canvas != null){
					surfaceHolder.unlockCanvasAndPost(canvas);
				}
			}
		}
		
	}

}
