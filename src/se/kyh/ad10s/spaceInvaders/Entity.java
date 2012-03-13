package se.kyh.ad10s.spaceInvaders;

import android.graphics.Canvas;
import android.graphics.Rect;

public abstract class Entity {
	
	private int xPos;
	private int yPos;
	
	public Entity(int x, int y){
		this.setxPos(x);
		this.setyPos(y);
		
//		EntityManager.INSTANCE.addEntity(this);
		
	}

	public void onDraw(Canvas canvas) {
		
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public void updatePosition() {
		
	}
	
	public void movement(int deltaX, int deltaY){
		setxPos(getxPos() + deltaX);
		setyPos(getyPos() + deltaY);
	}
	
	public void collision(){
		
	}

	public Rect getDestRect() {
		// TODO Auto-generated method stub
		return null;
	}

}
