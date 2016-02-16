package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Display {
	
	private Shape[] shapes;
	
	public Display(){
		shapes = null;
	}
	public Display(Shape[] s){
		shapes = s;
	}
	
	public Shape[] getShapes() {
		return shapes;
	}
	public void setShapes(Shape[] shapes) {
		this.shapes = shapes;
	}
	
	public double totalArea(){
		double tot = 0;
		for(Shape s: shapes){
			tot += s.area();
		}
		return tot;
	}
	public double totalPerimeter(){
		double tot = 0;
		for(Shape s: shapes){
			tot += s.perimeter();
		}
		return tot;
	}
}
