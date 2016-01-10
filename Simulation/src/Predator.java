
public class Predator {
	int x;
	int y;
	int egg;
	int hunger;
	boolean alive;
	
	public Predator(int x, int y){
		this.x = x;
		this.y = y;
		egg = 0;
		hunger = 0;
		alive = true;
	}
	public Predator(){
		x = -1;
		y = -1;
		egg = -1;
		hunger = -1;
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
	public int getHunger(){
		return hunger;
	}
	
	public void resetEgg(){
		egg = 0;
	}
	public void resetHunger(){
		hunger = 0;
	}
	
	public void increaseEgg(){
		++egg;
	}
	public void increaseHunger(){
		++hunger;
	}
	
	public boolean isAlive(){
		return alive;
	}
	public void kill(){
		alive = false;
	}
	
	public boolean isPredator(){
		return true;
	}
	public boolean isPrey(){
		return false;
	}
}
