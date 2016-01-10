
public class HealthCalculator {
	
	public double calculateIMC(Person p){
		return p.weight/(p.height*p.height);
	}
}
