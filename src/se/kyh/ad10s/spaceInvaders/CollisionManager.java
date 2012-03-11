package se.kyh.ad10s.spaceInvaders;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import android.graphics.Rect;

public class CollisionManager {
	
	public static final CollisionManager INSTANCE = new CollisionManager();
	
	public CollisionManager(){
		
	}
	
	public void collision(){
//		CopyOnWriteArrayList<Entity> entityArray = EntityManager.INSTANCE.getCopyOnWriteArrayListEntity();
//		Rect shot = null, alien = null;
//		for(Entity entity : entityArray){
////			if(entity instanceof Shot){
////				shot = entity.getDestRect();
////			} else if (entity instanceof Alien){
////				alien = entity.getDestRect();
////			} 
//			if(Rect.intersects(shot, alien)){
//				entity.collision();
//			} 
////			Rect e1 = entity.getDestRect();
////			Rect e2 = entity.getDestRect();	
//		}
		
	}

}
