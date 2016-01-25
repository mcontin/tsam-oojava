package contin.mattia.videoteca;

public class Film {
	private String titolo;
	private String regista;
	private int annoProduzione;
	private String[] attori;
	private int giorni;
	
	public Film(String titolo, String regista, int annoProduzione, String[] attori, int giorni) {
		this.titolo = titolo;
		this.regista = regista;
		this.annoProduzione = annoProduzione;
		this.attori = attori;
		this.giorni = giorni;
	}
	public Film(){
		titolo = null;
		regista = null;
		annoProduzione = -1;
		attori = null;
		giorni = -1;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public int getAnnoProduzione() {
		return annoProduzione;
	}
	public void setAnnoProduzione(int annoProduzione) {
		this.annoProduzione = annoProduzione;
	}
	public String[] getAttori() {
		return attori;
	}
	public void setAttori(String[] attori) {
		this.attori = attori;
	}
	public int getGiorni(){
		return giorni;
	}
	public void setGiorni(int giorni){
		this.giorni = giorni;
	}

	public int getTariffa(){
		return 0;
	}
}