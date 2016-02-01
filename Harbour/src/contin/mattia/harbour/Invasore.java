package contin.mattia.harbour;

public abstract class Invasore {
	
	protected int id;
	protected String modello;
	protected double p;
	
	public Invasore(int id, String modello) {
		this.id = id;
		this.modello = modello;
		this.p = -1;
	}
	public Invasore() {
		id = -1;
		modello = null;
		p = -1;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public double getP() {
		return p;
	}
	
	abstract void setP();
	
	public double getMqDistrutti(){
		return p*1.5;
	};
	
}
