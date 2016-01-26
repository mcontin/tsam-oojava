package contin.mattia.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.videoteca.Film;

public class BlurayTest extends Film{

	@Test
	public void test() {
		BlurayTest c = new BlurayTest();
		c.setGiorni(7);
		
		int tariffa = 100;
		
		if(c.getGiorni() == 1){
			tariffa = 100;
		}
		else{
			for(int i=0; i<c.getGiorni(); i++){
				tariffa += 	100 + tariffa/10; 
			}
		}
		
		assertEquals(1142,tariffa);
		
	}

}
