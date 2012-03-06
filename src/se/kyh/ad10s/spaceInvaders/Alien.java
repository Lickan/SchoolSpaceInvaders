package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;

public class Alien extends PicEntity {

//	private int yMov;
//	private int xMov;
	private int score;

	public Alien(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		
//		xMov = 3;
//		yMov = 0;
	}

	public void addScore(int amount){
		score += amount;
	}
	

}
