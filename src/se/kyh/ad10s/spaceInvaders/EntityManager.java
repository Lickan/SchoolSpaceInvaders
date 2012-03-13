package se.kyh.ad10s.spaceInvaders;

import java.util.concurrent.CopyOnWriteArrayList;
import android.graphics.Canvas;

public class EntityManager {
	
public static final EntityManager INSTANCE = new EntityManager();
	
	private CopyOnWriteArrayList<Entity> entities;

	private int yMov;

	private int xMov;
	
	public Entity entity;
	
	public EntityManager(){
		this.entities = new  CopyOnWriteArrayList<Entity>();
	}
	
	public CopyOnWriteArrayList<Entity> getCopyOnWriteArrayListEntity(){
		return entities;
	}
	
	public void addEntity(Entity entity){
		this.entities.add(entity);
	}
	
	public void drawEntities(Canvas canvas){
		for(Entity entity : this.entities){
			entity.onDraw(canvas);
			entity.updatePosition();
		}
	}
	
	public void clearEntities(){
		entities.clear();
	}
	
	public void removeEntity(Entity entity){
		entities.remove(entity);
	}
}
