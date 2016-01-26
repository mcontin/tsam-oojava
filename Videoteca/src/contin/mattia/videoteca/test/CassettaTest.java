package contin.mattia.videoteca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.videoteca.Film;

public class CassettaTest extends Film{

	@Test
	public void test() {
		CassettaTest c = new CassettaTest();
		c.setGiorni(7);
		int tariffa = 1 + (c.getGiorni()-1) * 2;
		assertEquals(13,tariffa);
	}

}
