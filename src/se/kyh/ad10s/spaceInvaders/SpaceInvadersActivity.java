package se.kyh.ad10s.spaceInvaders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;

public class SpaceInvadersActivity extends Activity {
    /** Called when the activity is first created. */
	
	
	static Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void clickStartGame(View v){
    	 Display display = getWindowManager().getDefaultDisplay();
         int screenWidth = display.getWidth();
         int screenHeight = display.getHeight();
         
         context = this;
         
         Panel panel = new Panel(this, screenWidth, screenHeight);
         setContentView(panel);
    }
    
    public void onStop(){
    	super.onStop();
    	EntityManager.INSTANCE.clearEntities();
    }

}