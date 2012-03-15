package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;

public class Shot extends PicEntity{
	
	private int xMov;
	private int yMov;

	public Shot(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		this.bitmap = bitmap;
		
		xMov = 0;
		yMov = -3;
		
		EntityManager.INSTANCE.addShot(this);
	}
	
	@Override
	public void updatePosition(){
		if(getyPos() <= 0){
			EntityManager.INSTANCE.removeShot(this);
		}
		movement(xMov, yMov);	
	}
	
	@Override 
	public void collision(){
		EntityManager.INSTANCE.removeShot(this);
	}

}
