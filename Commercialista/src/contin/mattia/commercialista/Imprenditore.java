package contin.mattia.commercialista;

public class Imprenditore extends Persona{
	private String pivaSocieta;
	private String ragioneSociale;
	private int fatture;
	
	public Imprenditore(String nome, String cognome, String cf, String piva, String ragioneSociale, int fatture) {
		super(nome, cognome, cf);
		this.pivaSocieta = piva;
		this.ragioneSociale = ragioneSociale;
		this.fatture = fatture;
	}

	public Imprenditore(){
		super();
		pivaSocieta = null;
		ragioneSociale = null;
		fatture = -1;
	}
	public String getPiva() {
		return pivaSocieta;
	}

	public void setPiva(String piva) {
		this.pivaSocieta = piva;
	}

	public String getRagioneSociale() {
		return ragioneSociale;
	}

	public void setRagioneSociale(String ragioneSociale) {
		this.ragioneSociale = ragioneSociale;
	}

	public int getFatture() {
		return fatture;
	}

	public void setFatture(int fatture) {
		this.fatture = fatture;
	}
	
	
}
