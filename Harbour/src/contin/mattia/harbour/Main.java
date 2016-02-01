package contin.mattia.harbour;

public class Main {

	public static void main(String args[]){
		PortoNavale porto = new PortoNavale(30000);
		Gioco partita = new Gioco(porto);

		Aereo rosso = new Aereo(1, "red", 3, 6);						//180 dmg
		Aereo blu = new Aereo(2, "blue", 1, 2);							//60 dmg	
		Aereo verde = new Aereo(3, "green", 2, 7);						//195 dmg
		Aereo giallo = new Aereo(4, "yellow", 7, 11);					//345 dmg

		Sottomarino oro = new Sottomarino(1, "gold", 20, 10);			//200
		Sottomarino argento = new Sottomarino(1, "silver", 20, 10);		//200
		Sottomarino cristallo = new Sottomarino(1, "crystal", 20, 10);	//200
																		//tot = 1380
																		// 30000/1380 = 22
		
		Invasore[] invasori = {rosso,blu,verde,giallo,oro,argento,cristallo};
		
		int turni = 0;
		do{
			turni += partita.attaccaPorto(invasori);
		}while(!partita.isDestroyed());
		System.out.println(turni);
	}
	
}
