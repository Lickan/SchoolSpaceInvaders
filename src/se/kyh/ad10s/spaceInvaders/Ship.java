package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;

public class Ship extends PicEntity{
	
	private int yMov;
	private int xMov;

	public Ship(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		
		xMov = 3;
		yMov = 0;
		
		EntityManager.INSTANCE.addEntity(this);
	}
}
