package contin.mattia.commercialista;

public class Main {
	private static Dipendente[] dipendenti = new Dipendente[1];
	private static LiberoProfessionista[] liberiProfessionisti = new LiberoProfessionista[1];
	private static Imprenditore[] imprenditori = new Imprenditore[1];
	
	public static void main(String[] args){
		Dipendente paolo = new Dipendente("paolo","rossi","123456789asdcxfv");
		Imprenditore silvio = new Imprenditore("silvio", "berlusconi", "silvioberlusconi", "asd", "asdasd", 126);
		LiberoProfessionista adriano = new LiberoProfessionista("adriano","melillo","adrianomelillo94","asd", 7);

		dipendenti[0] = paolo;
		liberiProfessionisti[0] = adriano;
		imprenditori[0] = silvio;
		
		System.out.println(getIncassoTotale()); //expected 629.5, got 629.5
	}
	
	/* DOWNCASTING = BAD
	public static double calcolaIncasso(Persona[] clienti){
		double incasso = 0;
		
		for(Persona p: clienti){
			if(p instanceof Dipendente){
				incasso += 50;
			}
			else if(p instanceof Imprenditore){
				incasso += 500;
				if(((Imprenditore)p).getFatture() > 100){
					incasso += (((Imprenditore) p).getFatture() - 100);
				}
			}
			else if(p instanceof LiberoProfessionista){
				incasso += 50 + (0.50 * ((LiberoProfessionista)p).getFatture());	
			}
			else {
				incasso += 50;
			}
		}
		
		return incasso;
	}
	*/ 
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
