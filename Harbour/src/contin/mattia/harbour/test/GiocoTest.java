package contin.mattia.harbour.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.harbour.Aereo;
import contin.mattia.harbour.Gioco;
import contin.mattia.harbour.Invasore;
import contin.mattia.harbour.PortoNavale;
import contin.mattia.harbour.Sottomarino;

public class GiocoTest extends Gioco{
	

	@Test
	public void test() {

		PortoNavale portoNavale = new PortoNavale(30000);
		
		Aereo rosso = new Aereo(1, "red", 3, 6);						//180 dmg
		Aereo blu = new Aereo(2, "blue", 1, 2);							//60 dmg	
		Aereo verde = new Aereo(3, "green", 2, 7);						//195 dmg
		Aereo giallo = new Aereo(4, "yellow", 7, 11);					//345 dmg

		Sottomarino oro = new Sottomarino(1, "gold", 20, 10);			//200
		Sottomarino argento = new Sottomarino(1, "silver", 20, 10);		//200
		Sottomarino cristallo = new Sottomarino(1, "crystal", 20, 10);	//200
																		//tot = 1380
																		// 30000/1380 = 22
		setPorto(portoNavale);
		Invasore[] invasori = {rosso,blu,verde,giallo,oro,argento,cristallo};
		assertEquals(153, attaccaFinoAllaDistruzione(invasori));
	}

	public int attaccaFinoAllaDistruzione(Invasore[] invasori){
		int turni = 0;
		do{
			turni += attaccaPorto(invasori);
		}while(!isDestroyed());
		return turni;
	}
	
}
