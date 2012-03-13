package se.kyh.ad10s.spaceInvaders;

import java.util.concurrent.CopyOnWriteArrayList;
import android.graphics.Rect;

public class CollisionManager {
	
	public static final CollisionManager INSTANCE = new CollisionManager();
	
	public CollisionManager(){
		
	}
	
	public boolean collision(){
		
		CopyOnWriteArrayList<Entity> entityArray = EntityManager.INSTANCE.getCopyOnWriteArrayListEntity();
		CopyOnWriteArrayList<Entity> shotsArray = EntityManager.INSTANCE.getShotsList();
		
		for(Entity entity : entityArray){
			if(entity instanceof Alien){
				for(Entity shot : shotsArray){	
					if(Rect.intersects(entity.getDestRect(), shot.getDestRect())){
						entity.collision();
						shot.collision();
						return true;
					}
				}
			}
		}
		return false;
	}
}
