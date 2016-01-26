package contin.mattia.commercialista;

public class Main {
	
	private static Persona[] clienti;
	
	public static void main(String[] args){
		Dipendente paolo = new Dipendente("paolo","rossi","123456789asdcxfv");
		Imprenditore silvio = new Imprenditore("silvio", "berlusconi", "silvioberlusconi", "asd", "asdasd", 126);
		LiberoProfessionista adriano = new LiberoProfessionista("adriano","melillo","adrianomelillo94","asd", 7);
		
		clienti = new Persona[5];
		clienti[0] = paolo;
		clienti[1] = silvio;
		clienti[2] = adriano;
		
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
		
		for(Persona p: clienti){
			incasso += p.getIncasso();
		}
		
		return incasso;
	}
	
}
