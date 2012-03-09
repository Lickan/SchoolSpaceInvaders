package se.kyh.ad10s.spaceInvaders;

import java.util.concurrent.CopyOnWriteArrayList;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;

public class EntityManager {
	
public static final EntityManager INSTANCE = new EntityManager();
	
	private  CopyOnWriteArrayList<Entity> entities;

	private int yMov;

	private int xMov;
	
	public Entity entity;
	
	public EntityManager(){
		this.entities = new  CopyOnWriteArrayList<Entity>();
	}
	
	public void addEntity(Entity entity){
		this.entities.add(entity);
	}
	
	public void drawEntities(Canvas canvas){
		for(Entity entity : this.entities){
			if(this.entities.getClass().getSimpleName() == "Alien"){
				AlienRow alienRow = new AlienRow(Panel.resources);
				int i;
				for(i = 0; i <= 4; i++){
					Bitmap alienBitmap = alienRow.alienBitmaps.get("alien" + i);
					Bitmap rectangle = Bitmap.createBitmap(alienBitmap.getWidth() * 4, alienBitmap.getHeight(), alienBitmap.getConfig());
					canvas = new Canvas(rectangle);
					Paint paint = new Paint();
					paint.setColor(Color.TRANSPARENT);
					canvas.drawBitmap(alienBitmap, new Matrix(), null);
					canvas.drawRect(0, alienBitmap.getHeight(), alienBitmap.getWidth() * 4, 0, paint);
				}
				updateAlienPosition();
			} else {
			entity.onDraw(canvas);
			entity.updatePosition();
			}
		}
	}
	
	public void clearEntities(){
		entities.clear();
	}
	
	public void updateAlienPosition(){
		xMov = 3;
		yMov = 0;
		
		if(entity.getyPos() <= 0){
			entity.setyPos(Panel.screenHeight / 2);
			entity.setxPos(Panel.screenWidth / 2);
			yMov = yMov * -1;
		} else if(entity.getyPos() >= Panel.screenHeight){
			entity.setyPos(Panel.screenHeight / 2);
			entity.setxPos(Panel.screenWidth / 2);
			yMov = yMov * -1;
		}
		
		entity.movement(xMov, yMov);	
		
	}

}
