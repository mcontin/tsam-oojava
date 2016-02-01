package contin.mattia.harbour;

public class Aereo extends Invasore {

	private int armamentiAlpha;
	private int armamentiBeta;
	
	public Aereo(int id, String modello, int armamentiAlpha, int armamentiBeta) {
		super(id, modello);
		this.armamentiAlpha = armamentiAlpha;
		this.armamentiBeta = armamentiBeta;
		this.setP();
	}
	public Aereo(){
		super();
		armamentiAlpha = -1;
		armamentiBeta = -1;
	}

	public int getArmamentiAlpha() {
		return armamentiAlpha;
	}
	public void setArmamentiAlpha(int armamentiAlpha) {
		this.armamentiAlpha = armamentiAlpha;
	}
	public int getArmamentiBeta() {
		return armamentiBeta;
	}
	public void setArmamentiBeta(int armamentiBeta) {
		this.armamentiBeta = armamentiBeta;
	}
	
	@Override
	void setP() {
		p = armamentiAlpha*10 + armamentiBeta*25;
	}

}
