package contin.mattia.videoteca;

public class Main {
	public static Film[] films;
	
	public static void main(String[] args){
		
		Cassetta cassetta1 = new Cassetta();
		Dvd dvd1 = new Dvd();
		Bluray bluray1 = new Bluray();
		
		cassetta1.setGiorni(3);
		dvd1.setGiorni(5);
		bluray1.setGiorni(3);
	
		Film[] films = {cassetta1,dvd1,bluray1,null,null};
		
		System.out.println(getTariffe());
	}
	
	public static double getTariffe(){
		double tariffa = 0;
		for(Film film: films){
			tariffa += film.getTariffa();
		}
		return tariffa;
	}
	
}
