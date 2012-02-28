package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;

public class Alien extends PicEntity {

	private int yMov;
	private int xMov;

	public Alien(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		
		xMov = 3;
		yMov = 0;
	}
	
	@Override
	public void updatePosition(){
//		movement(1, 0);
		if(getCenterX() > Panel.screenWidth){
			xMov = -3;
			
		} else if(getCenterX() < 0) {
			xMov = 3;
		}
		
		if(getyPos() <= 0){
			setyPos(Panel.screenHeight / 2);
			setxPos(Panel.screenWidth / 2);
			yMov = yMov * -1;
		} else if(getyPos() >= Panel.screenHeight){
			setyPos(Panel.screenHeight / 2);
			setxPos(Panel.screenWidth / 2);
			yMov = yMov * -1;
		}
		
		movement(xMov, yMov);	
		
	}
}
