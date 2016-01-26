package contin.mattia.videoteca;

public class Dvd extends Film{

	public int getTariffa(){
		if(getGiorni() <= 2){
			return 150 * getGiorni();
		}
		return (3 + 2 * getGiorni()) * 100;
	}
	
}
