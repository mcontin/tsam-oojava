package contin.mattia.azienda;
import java.util.ArrayList;

public class Azienda {
	
	private String nome;
	private String piva;
	private ArrayList<Dipendente> dipendenti; 
	
	public Azienda(String n, ArrayList<Dipendente> w){
		this.nome = n;
		this.dipendenti = w;
	};
	public Azienda(){
		nome = null;
		dipendenti = null;
	}
	
	public int stipendi(){
		int tot = 0;
		for(Dipendente x:dipendenti){
			tot += x.stipendio();
		}
		return tot;
	}
	
	public ArrayList<Dipendente> getMostPayed(){
		ArrayList<Dipendente> mostPayed = new ArrayList<Dipendente>();
		double highestWage = 0;
		for(Dipendente x:dipendenti){
			if (x.stipendio() > highestWage)
				highestWage = x.stipendio();
		}
		for(Dipendente x:dipendenti){
			if(x.stipendio() == highestWage){
				mostPayed.add(x);
			}
		}
		return mostPayed;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	public void setDipendenti(ArrayList<Dipendente> workers) {
		this.dipendenti = workers;
	}
	
	
}
