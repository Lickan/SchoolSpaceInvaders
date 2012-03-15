package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;

public class Ship extends PicEntity{
	
	private static Ship ship;
	private int yMov;
	private int xMov;
	static String shipHit;

	public Ship(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		
		xMov = 3;
		yMov = 0;
		
		EntityManager.INSTANCE.addEntity(this);
	}
	
	@Override
	public void collision(){
		shipHit = "Hit";
	}
	
	public static boolean shipLose(){
		if(shipHit == "Hit"){
			return true;
		}
		return false;
	}
}
