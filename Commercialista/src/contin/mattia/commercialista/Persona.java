package contin.mattia.commercialista;

public class Persona {
	private String nome;
	private String cognome;
	private String cf;
	
	public Persona(String nome, String cognome, String cf) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}
	public Persona(){
		nome = null;
		cognome = null;
		cf = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		if(cf.length() != 16)
			return;
		this.cf = cf;
	}
	
	public double getIncasso(){return 0;};
	
}
