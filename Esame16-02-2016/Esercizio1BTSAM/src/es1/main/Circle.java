package es1.main;

/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Circle implements Shape{
	
	private double radius;

	public Circle(){
		radius = 0;
	}
	public Circle(double r){
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double area(){
		return Math.PI * (radius*radius);
	}
	@Override
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
	
	
}
