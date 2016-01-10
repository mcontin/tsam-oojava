
public class BaseMetabolicRate {
	public static void main(String[] args){
		System.out.println("Inserire altezza in cm, peso in kg, età, attività fisica e sesso");
		Person a = new Person(173, 66, 37, "attivo", 'f');
		Health calculator = new Health();
		System.out.println(calculator.calculateMB(a));
	}
}
