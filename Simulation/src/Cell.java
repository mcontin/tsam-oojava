
public class Cell {
	/*
	 * int x;
	 * int y;
	*/
	boolean isFree;
	Object element;
	char val;
	
	/*public Cell(int x, int y){
		this.x = x;
		this.y = y;
		isFree = true;
	}*/
	
	public Cell(){
		element = null;
		isFree = true;
		val = '_';
	}
	
	public void occupy(Object e){
		element = e;
		isFree = false;
		if(e instanceof Predator){
			val = 'x';
		}
		else {
			val = 'o';
		}
	}
	public void free(){
		element = null;
		isFree = true;
		val = '_';
	}
	
	public boolean isFree(){
		return isFree;
	}
	
	public boolean isTherePrey(){
		if(element instanceof Prey){
			return true;
		}
		return false;
	}
	
	
}
