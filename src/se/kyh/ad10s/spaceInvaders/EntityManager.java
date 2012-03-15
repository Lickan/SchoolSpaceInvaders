package se.kyh.ad10s.spaceInvaders;

import java.util.concurrent.CopyOnWriteArrayList;
import android.graphics.Canvas;

public class EntityManager {
	
public static final EntityManager INSTANCE = new EntityManager();
	
	private CopyOnWriteArrayList<Entity> entities;
	private CopyOnWriteArrayList<Entity> shots;
	private CopyOnWriteArrayList<Entity> alienShots;

	private int yMov;

	private int xMov;
	
	public Entity entity;

	private Ship ship;
	
	public EntityManager(){
		this.entities = new  CopyOnWriteArrayList<Entity>();
		this.shots = new CopyOnWriteArrayList<Entity>();
		this.alienShots = new CopyOnWriteArrayList<Entity>();
	}
	
	public CopyOnWriteArrayList<Entity> getCopyOnWriteArrayListEntity(){
		return entities;
	}
	
	public CopyOnWriteArrayList<Entity> getShotsList(){
		return shots;
	}
	public CopyOnWriteArrayList<Entity> getAlienShotsList(){
		return alienShots;
	}
	
	public void addShot(Entity entity){
		this.shots.add(entity);
	}
	
	public void addAlienShot(Entity entity){
		this.alienShots.add(entity);
	}
	
	public void addEntity(Entity entity){
		this.entities.add(entity);
	}
	
	public void drawEntities(Canvas canvas){
		for(Entity entity : this.entities){
			entity.onDraw(canvas);
			entity.updatePosition();
		}
		for(Entity shot : this.shots){
			shot.onDraw(canvas);
			shot.updatePosition();
		}
		for(Entity alienShot : this.alienShots){
			alienShot.onDraw(canvas);
			alienShot.updatePosition();
		}
	}
	
	public void clearEntities(){
		entities.clear();
		shots.clear();
		alienShots.clear();
	}
	
	public void removeEntity(Entity entity){
		entities.remove(entity);
	}
	
	public void removeShot(Entity entity){
		shots.remove(entity);
	}
	
	public void removeAlienShot(Entity entity){
		alienShots.remove(entity);
	}
	
	public void checkGame(Canvas canvas){
		if(Alien.alienWin()){
			Panel.gameFinish(true, canvas);
		}
		if(Ship.shipLose()){
			Panel.gameFinish(false, canvas);
		}
	}
}
