package se.kyh.ad10s.spaceInvaders;

import java.util.HashMap;
import java.util.Map;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;

public class AlienGroup{
	private Resources resources;
	Map<String, Alien> map = new HashMap<String, Alien>();
	
	
	int screenWidth;
	int screenHeight;
	
	public AlienGroup(Resources resources){
		this.resources = resources;
	}
	
	public Map<String, Alien> createAlienGroup(int amountOfAlienRows, int amountOfAliensInRow, int screenWidth, int screenHeight){
		int heightPosition;
		String picture;
		AlienRow alienRow = new AlienRow(resources);
		for (int i = 0; i < amountOfAlienRows; i++){
			heightPosition = 6-i;
			picture = "alien" + (i+1);
			map.putAll(alienRow.createAlienRow(amountOfAliensInRow, screenWidth, screenHeight, heightPosition, picture));
		}
		return map;
	}
	
	public void updatePosition(){
		AlienRow alienRow = new AlienRow(resources);
		int bitmapWidth =	alienRow.alienBitmaps.get("alien1").getWidth();;
		int rowWidth = bitmapWidth * alienRow.alienBitmaps.size();
		
		
		
	}
}