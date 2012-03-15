package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;
import android.util.Log;

public class Alien extends PicEntity {

	private static Alien alien;
	private int yMov;
	private int xMov;
	private int score;
	int framecount = 1+(int)(100*Math.random());
	int frame = 300 + 1+(int)(100*Math.random());
	static int alienCount = 12;

	public Alien(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		xMov = 3;
		yMov = 0;
		
		EntityManager.INSTANCE.addEntity(this);	
	}
	
	@Override
	public void updatePosition(){

			if(Panel.map.get("alien01") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()*3){
					xMov = xMov * -1;
				} else if (getxPos() <= 0){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth()*3 - 1)){
					if(getyPos() <= 600 - getBitmapHeight()*3){
						yMov = getBitmapHeight()/2;
					}
				} 
			} else if(Panel.map.get("alien02") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()*3){
					xMov = xMov * -1;
				} else if (getxPos() <= 0){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth()*3 - 1)){
					if(getyPos() <= 600 - getBitmapHeight()){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien03") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()*3){
					xMov = xMov * -1;
				} else if (getxPos() <= 0){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth()*3 - 1)){
					if(getyPos() <= 600){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien11") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()*2){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth()*2 - 1)){
					if(getyPos() <= 600 - getBitmapHeight()*3){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien12") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()*2){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth()*2 - 1)){
					if(getyPos() <= 600 - getBitmapHeight()){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien13") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()*2){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth()*2 - 1)){
					if(getyPos() <= 600){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien21") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()*2){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth() - 2)){
					if(getyPos() <= 600 - getBitmapHeight()*3){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien22") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()*2){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth() - 2)){
					if(getyPos() <= 600 - getBitmapHeight()){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien23") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth - getBitmapWidth()){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()*2){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - (getBitmapWidth() - 2)){
					if(getyPos() <= 600){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien31") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()*3){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth  + 1){
					if(getyPos() <= 600 - getBitmapHeight()*3){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien32") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()*3){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth + 1){
					if(getyPos() <= 600 - getBitmapHeight()){
						yMov = getBitmapHeight()/2;
					}
				}
			} else if(Panel.map.get("alien33") == this){
				if(getxPos() + getBitmapWidth() > Panel.screenWidth){
					xMov = xMov * -1;
				} else if (getxPos() <= 0 + getBitmapWidth()*3){
					xMov = xMov * -1;
				}
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth + 1){
					if(getyPos() <= 600){
						yMov = getBitmapHeight()/2;
					}
				}
			}
			movement(xMov, yMov);
			yMov = 0;
			
			framecount++;
			if(framecount > frame){
				
			AlienShot alienshot = new AlienShot(getxPos() + (Panel.map.get("alien01").getBitmapWidth()/ 2), getyPos() + Panel.map.get("alien01").getBitmapHeight(), Panel.alienShotBitmap);
			alienshot.updatePosition();
			framecount = 0;
			}
	}
	
	
	@Override
	public void collision(){
		
		if(Panel.map.get("alien01") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien02") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien03") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien11") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien12") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien13") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien21") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien22") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien23") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien31") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien32") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		if(Panel.map.get("alien33") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
			alienCount--;
		}
		
		
	}
	
	public static boolean alienWin(){
		if(alienCount == 0){
			return true; 
		}
		return false;
	}
	

}
