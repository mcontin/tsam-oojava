
public class IMC {
	public static void main(String[] args){
		System.out.println("Inserire altezza in cm, peso in kg, età, attività fisica e sesso");
		Person a = new Person(173, 66, 37, "attivo", 'f');
		HealthCalculator calculator = new HealthCalculator();
		System.out.println(calculator.calculateIMC(a));
	}
}
