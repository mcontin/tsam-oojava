package contin.mattia.azienda;

public class Dipendente {
	
	private String name;
	private String surname;
	private ContrattoLavoro contract;
	
	public Dipendente(String n, String surn){
		this.name = n;
		this.surname = surn;
	}
	public Dipendente(){
		name = null;
		surname = null;
	}
	
	public int stipendio(){
		return contract.stipendio();
	}
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	
	public String getCognome() {
		return surname;
	}
	public void setCognome(String surname) {
		this.surname = surname;
	}
	
	public ContrattoLavoro getContratto() {
		return contract;
	}
	public void setContratto(ContrattoLavoro contract) {
		this.contract = contract;
	}
	
	
}
