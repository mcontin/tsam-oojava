import java.util.ArrayList;

public class Company {
	String name;
	ArrayList<Worker> workers; 
	
	public Company(String n, ArrayList<Worker> w){
		this.name = n;
		this.workers = w;
	};
	public Company(){
		name = null;
		workers = null;
	}
	
	public double getTotalWage(){
		double tot = 0;
		for(Worker x:workers){
			tot += x.getAnnualWage();
		}
		return tot;
	}
	
	public ArrayList<Worker> getMostPayed(){
		ArrayList<Worker> mostPayed = new ArrayList<Worker>();
		double highestWage = 0;
		for(Worker x:workers){
			if (x.getAnnualWage() > highestWage)
				highestWage = x.getAnnualWage();
		}
		for(Worker x:workers){
			if(x.getAnnualWage() == highestWage){
				mostPayed.add(x);
			}
		}
		return mostPayed;
	}
}
