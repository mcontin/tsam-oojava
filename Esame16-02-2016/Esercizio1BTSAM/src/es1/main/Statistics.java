package es1.main;


/**
 * ************* *
 * DA COMPLETARE *
 * ************* *
 */
public class Statistics {
	
	public double perimeter;
	public double area;
	
	public Statistics(double perimeter, double area){
		this.perimeter = perimeter;
		this.area = area;
	}
	public Statistics(){
		perimeter = 0;
		area = 0;
	}

	public void add(Statistics stats){
		this.perimeter += stats.getPerimeter();
		this.area += stats.getArea();
	}
	
	public double getArea(){
		return area;
	}
	public double getPerimeter(){
		return perimeter;
	}
}
