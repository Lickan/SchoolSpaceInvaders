package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class PicEntity extends Entity{
	
	Bitmap bitmap;
	
	Rect sourceRect;

	public PicEntity(int x, int y, Bitmap bitmap){
		super(x, y);
		this.bitmap = bitmap;
		
		sourceRect = new Rect(0, 0, getBitmapWidth(), getBitmapHeight());
		
	}
	
	public int getBitmapHeight(){
		return this.bitmap.getHeight();
	}
	
	public void setCenterX(int x){
		setxPos(x- getBitmapWidth() / 2);
	}
	
	public int getCenterX(){
		return getxPos() - getBitmapWidth() / 2;
	}
	
	public int getBitmapWidth(){
		return this.bitmap.getWidth();
	}
	
	@Override
	public void onDraw(Canvas canvas){
		Rect destinationRect = new Rect(getxPos(), getyPos(), getxPos() + getBitmapWidth(), getyPos() + getBitmapHeight());
		canvas.drawBitmap(bitmap, sourceRect, destinationRect, null);
	}

}
