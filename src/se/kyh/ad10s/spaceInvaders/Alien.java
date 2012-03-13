package se.kyh.ad10s.spaceInvaders;

import android.graphics.Bitmap;

public class Alien extends PicEntity {

	private int yMov;
	private int xMov;
	private int score;

	public Alien(int x, int y, Bitmap bitmap){
		super(x, y, bitmap);
		xMov = 3;
		yMov = 0;
		
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
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth  - 1){
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
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - 1){
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
				if(getxPos() + getBitmapWidth() >= Panel.screenWidth - 1){
					if(getyPos() <= 600){
						yMov = getBitmapHeight()/2;
					}
				}
			}
			movement(xMov, yMov);
			yMov = 0;
	}
	
	
	@Override
	public void collision(){
		if(Panel.map.get("alien01") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien02") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien03") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien11") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien12") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien13") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien21") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien22") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien23") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien31") == this){
			PointManager.INSTANCE.addScore(30);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien32") == this){
			PointManager.INSTANCE.addScore(20);
			EntityManager.INSTANCE.removeEntity(this);
		}
		if(Panel.map.get("alien33") == this){
			PointManager.INSTANCE.addScore(10);
			EntityManager.INSTANCE.removeEntity(this);
		}
		
	}
	

}
