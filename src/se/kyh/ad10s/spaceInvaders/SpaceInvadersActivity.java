package se.kyh.ad10s.spaceInvaders;

import android.app.Activity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

public class SpaceInvadersActivity extends Activity {
    /** Called when the activity is first created. */
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void clickStartGame(View v){
    	 Display display = getWindowManager().getDefaultDisplay();
         int screenWidth = display.getWidth();
         int screenHeight = display.getHeight();
         
         Panel panel = new Panel(this, screenWidth, screenHeight);
         setContentView(panel);
    }
    
    public void onStop(){
    	super.onStop();
    	EntityManager.INSTANCE.clearEntities();
    }
}