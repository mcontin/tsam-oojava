package contin.mattia.azienda;

public class ContrattoLavoro {
	
	private String setTipo;
	private int stipendio;
	
	public ContrattoLavoro(String type, int annualWage){
		this.setTipo = type;
		this.stipendio = annualWage;
	}

	public String getType() {
		return setTipo;
		
	}

	public void setType(String type) {
		this.setTipo = type;
	}

	public int stipendio() {
		return stipendio;
	}

	public void setStipendio(int annualWage) {
		this.stipendio = annualWage;
	}
	
	
}
