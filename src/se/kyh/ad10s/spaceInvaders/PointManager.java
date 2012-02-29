package se.kyh.ad10s.spaceInvaders;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class PointManager {
	
	public static final PointManager INSTANCE = new PointManager();
	private int score;
	
	Paint scorePaint = new Paint();
	
	public PointManager(){
		
		this.scorePaint.setColor(Color.MAGENTA);
		this.scorePaint.setTextSize(20);
	}
	
	public void addScore(int amount){
		score += amount;
	}
	
	public void drawText(Canvas canvas, String text, int x, int y, Paint paint){
		canvas.drawText(text, x, y, paint);
	}
	
	public void updateScore(Canvas canvas){
		String scoreToDisplay = Integer.toString(score);
		drawText(canvas, "Score", 15, Panel.screenHeight / 9 - 25, scorePaint);
		drawText(canvas, scoreToDisplay, 15, Panel.screenHeight / 9, scorePaint);
	}

}
