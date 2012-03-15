package se.kyh.ad10s.spaceInvaders;

import java.util.Random;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

public class AlienShot extends PicEntity{
	
	private static Bitmap alienShotBitmap;
	private int xMov;
	private int yMov;
	private static AlienShot alienshot;
	static int xPos;
	static int yPos;

	public AlienShot(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		this.bitmap = bitmap;
		
		xMov = 0;
		yMov = 3;
		
		EntityManager.INSTANCE.addAlienShot(this);
		
	}
	
	@Override
	public void updatePosition(){
		movement(xMov, yMov);	
	}
	
	@Override 
	public void collision(){
		EntityManager.INSTANCE.removeAlienShot(this);
	}

}
