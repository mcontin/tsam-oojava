package contin.mattia.videoteca;

public class Bluray extends Film{
	
	
	public int getTariffa(){
		int tariffa = 100;
		
		if(getGiorni() == 1){
			return tariffa;
		}
		
		for(int i=0; i<getGiorni(); i++){
			tariffa += tariffa*10; 
		}
		
		return tariffa;
	}
	
}
