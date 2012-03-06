package se.kyh.ad10s.spaceInvaders;

import java.util.HashMap;
import java.util.Map;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class AlienRow{
	private Resources resources;
	Map<String, Bitmap> alienBitmaps = new HashMap<String, Bitmap>();
	
	public AlienRow(Resources resources){
		this.resources = resources;
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inSampleSize = 1/2;
		Bitmap alienBitmap1 = BitmapFactory.decodeResource(resources, R.drawable.drawing13, options);
		Bitmap alienBitmap2 = BitmapFactory.decodeResource(resources, R.drawable.drawing14, options);
		Bitmap alienBitmap3 = BitmapFactory.decodeResource(resources, R.drawable.drawing15);

		alienBitmaps.put("alien1", Bitmap.createScaledBitmap(alienBitmap1, 50, 35, false));
		alienBitmaps.put("alien2", Bitmap.createScaledBitmap(alienBitmap2, 50, 50, false));
		alienBitmaps.put("alien3", Bitmap.createScaledBitmap(alienBitmap3, 50, 50, false));
		
	}
	
	public Map<String, Alien> createAlienRow(int amountOfAliensInRow, int screenWidth, int screenHeight, int heightPosition, String picture){
		int addSpace = 0;
		

		Map<String, Alien> map = new HashMap<String, Alien>();
		
		for (int i = 0; i < amountOfAliensInRow; i++) {
			map.put("alien" + i, new Alien((30) + addSpace, screenHeight / heightPosition, alienBitmaps.get(picture)));

			addSpace = addSpace + alienBitmaps.get(picture).getWidth();
			
		}
		return map;
	}
}