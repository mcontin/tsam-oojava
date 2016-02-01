package contin.mattia.harbour;

public class Gioco {
	
	PortoNavale porto;
	
	public Gioco(PortoNavale porto){
		this.porto = porto;
	}
	public Gioco(){
		porto = null;
	}
	
	public void setPorto(PortoNavale porto){
		this.porto = porto;
	}
	
	public boolean isDestroyed(){
		return porto.getMqRimasti() <= 0;
	}
	
	public int attaccaPorto(Invasore[] invasori){
		int dimensionePorto = 0;
		int nAttacchi = 0;
		for(Invasore i: invasori){
			dimensionePorto = porto.getMqRimasti();
			porto.setMqRimasti((int)(dimensionePorto - Math.round(i.getP())));
			++nAttacchi;
			if(isDestroyed()){
				return nAttacchi;
			}
		}
		return nAttacchi;
	}
}