package contin.mattia.videoteca;

public class Cassetta extends Film{

	
	public int getTariffa(){
		int tariffa = 1 + getGiorni() * 2;
		return tariffa * 100;
	}
	
}
