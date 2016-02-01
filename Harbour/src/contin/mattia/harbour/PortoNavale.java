package contin.mattia.harbour;

public class PortoNavale {
	
	private int dimensione;
	private int mqRimasti;	
	
	public PortoNavale(int dimensione){
		this.dimensione = dimensione;
		mqRimasti = dimensione;
	}
	public PortoNavale(){
		dimensione = -1;
	}
	
	public int getDimensione() {
		return dimensione;
	}
	public void setDimensione(int dimensione) {
		this.dimensione = dimensione;
	}
	public int getMqRimasti() {
		return mqRimasti;
	}
	public void setMqRimasti(int mqRimasti) {
		this.mqRimasti = mqRimasti;
	}

}
