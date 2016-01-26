package contin.mattia.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.videoteca.Film;

public class DvdTest extends Film{

	@Test
	public void test() {
		DvdTest c = new DvdTest();
		c.setGiorni(7);
		int tariffa = 0;
		if(c.getGiorni() <= 2){
			tariffa = 150 * c.getGiorni();
		}
		else
			tariffa = (3 + 2 * (c.getGiorni()-2)) * 100;
		assertEquals(1300,tariffa);
	}

}
