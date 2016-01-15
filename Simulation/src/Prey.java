
public class Prey {
	int x;
	int y;
	int egg;
	boolean alive;
	
	public Prey(int x, int y){
		this.x = x;
		this.y = y;
		egg = 0;
		alive = true;
	}
	public Prey(){
		x = -1;
		y = -1;
		egg = -1;
		alive = true;
	}
	
	public void moveUp(){
		--y;
	}
	public void moveDown(){
		++y;
	}
	public void moveLeft(){
		--x;
	}
	public void moveRight(){
		++x;
	}

	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getEgg(){
		return egg;
	}
	
	public void increaseEgg(){
		++egg;
	}
	public void resetEgg(){
		egg = 0;
	}
	
	public boolean isAlive(){
		return alive;
	}
	public void kill(){
		alive = false;
	}
	
	public boolean isPredator(){
		return false;
	}
	public boolean isPrey(){
		return true;
	}
}
