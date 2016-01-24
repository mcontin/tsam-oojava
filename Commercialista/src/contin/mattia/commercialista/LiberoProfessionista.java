package contin.mattia.commercialista;

public class LiberoProfessionista extends Persona{
	private String piva;
	private int fatture;
	
	public LiberoProfessionista(String nome, String cognome, String cf, String piva, int fatture) {
		super(nome, cognome, cf);
		this.piva = piva;
		this.fatture = fatture;
	}
	public LiberoProfessionista(){
		super();
		piva = null;
		fatture = -1;
	}
	public String getPiva() {
		return piva;
	}
	public void setPiva(String piva) {
		this.piva = piva;
	}
	public int getFatture() {
		return fatture;
	}
	public void setFatture(int fatture) {
		this.fatture = fatture;
	}
	
}
