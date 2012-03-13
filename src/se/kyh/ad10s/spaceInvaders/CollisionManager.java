package se.kyh.ad10s.spaceInvaders;

import java.util.concurrent.CopyOnWriteArrayList;
import android.graphics.Rect;

public class CollisionManager {
	
	public static final CollisionManager INSTANCE = new CollisionManager();
	
	public CollisionManager(){
		
	}
	
	public boolean collision(){
		
		CopyOnWriteArrayList<Entity> entityArray = EntityManager.INSTANCE.getCopyOnWriteArrayListEntity();
		for(Entity entity1 : entityArray){
			for(Entity entity2 : entityArray){
				if(!entity1.equals(entity2)){	
					if(Rect.intersects(entity1.getDestRect(), entity2.getDestRect())){
						entity1.collision();
						entity2.collision();
						return true;
					}
				}
				
			}
		}
		return false;
	}
}
