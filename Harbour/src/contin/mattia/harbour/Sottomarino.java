package contin.mattia.harbour;

public class Sottomarino extends Invasore{

	private int stazza;
	private int armamenti;

	public Sottomarino(int id, String modello, int stazza, int armamenti) {
		super(id, modello);
		this.stazza = stazza;
		this.armamenti = armamenti;
		this.setP();
	}
	public Sottomarino(){
		super();
		stazza = -1;
	}
	
	public int getStazza() {
		return stazza;
	}
	public void setStazza(int stazza) {
		this.stazza = stazza;
	}

	public int getArmamenti() {
		return armamenti;
	}
	public void setArmamenti(int armamenti) {
		this.armamenti = armamenti;
	}
	
	@Override
	public void setP(){
		p = armamenti * stazza;
	}
	
}
