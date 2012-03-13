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
		
//			if(getxPos() + getBitmapWidth() > Panel.screenWidth){
//				xMov = xMov * -1;
//			} else if (getxPos() <= 0 + getBitmapWidth()*3){
//				xMov = xMov * -1;
//			}
//		Not working
//		if(getyPos() < Panel.screenHeight - 50){
//			ArrayList<Entity> entities = new ArrayList<Entity>();
//			entities.add(this);
//			entities.clear();	
//		}
		
		movement(xMov, yMov);	
	}

}
