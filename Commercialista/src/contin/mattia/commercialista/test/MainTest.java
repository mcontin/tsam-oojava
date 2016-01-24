package contin.mattia.commercialista.test;

import static org.junit.Assert.*;
import org.junit.Test;
import contin.mattia.commercialista.*;

public class MainTest {
	private static Dipendente[] dipendenti = new Dipendente[1];
	private static LiberoProfessionista[] liberiProfessionisti = new LiberoProfessionista[1];
	private static Imprenditore[] imprenditori = new Imprenditore[1];
	
	@Test
	public void test() {
		Dipendente paolo = new Dipendente("paolo","rossi","123456789asdcxfv");
		Imprenditore silvio = new Imprenditore("silvio", "berlusconi", "silvioberlusconi", "asd", "asdasd", 126);
		LiberoProfessionista adriano = new LiberoProfessionista("adriano","melillo","adrianomelillo94","asd", 7);

		dipendenti[0] = paolo;
		liberiProfessionisti[0] = adriano;
		imprenditori[0] = silvio;
		
		assertEquals(629.5, getIncassoTotale(), 0);
	}
	
	public static double getIncassoTotale(){
		double incasso = 0;
		
		incasso += incassoDipendenti();
		incasso += incassoLiberiProfessionisti();
		incasso += incassoImprenditori();
		
		return incasso;
	}
	
	private static double incassoDipendenti() {
		double incasso = 0;
		
		incasso += dipendenti.length * 50;
		
		return incasso;
	}
	
	private static double incassoLiberiProfessionisti() {
		double incasso = 0;

		for(LiberoProfessionista lp:liberiProfessionisti){
			incasso += 50 + (0.50 * lp.getFatture());
		}
		
		return incasso;
	}

	private static double incassoImprenditori() {
		double incasso = 0;
		
		for(Imprenditore i:imprenditori){
			incasso += 500;
			if(i.getFatture() > 100){
				incasso += (i.getFatture() - 100);
			}
		}
		
		return incasso;	
	}

}