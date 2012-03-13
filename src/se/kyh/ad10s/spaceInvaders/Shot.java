package se.kyh.ad10s.spaceInvaders;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import android.graphics.Bitmap;

public class Shot extends PicEntity{
	
	private int xMov;
	private int yMov;

	public Shot(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		this.bitmap = bitmap;
		
		xMov = 0;
		yMov = -3;
	}
	
	@Override
	public void updatePosition(){
		movement(xMov, yMov);	
	}
	
//	@Override 
//	public void collision(){
//		EntityManager.INSTANCE.removeEntity(this);
//	}

}
