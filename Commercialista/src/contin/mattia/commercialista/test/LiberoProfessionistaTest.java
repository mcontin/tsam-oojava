package contin.mattia.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.commercialista.LiberoProfessionista;

public class LiberoProfessionistaTest extends LiberoProfessionista{

	@Test
	public void test() {
		setFatture(6);
		assertEquals(53,getIncasso(),0);
	}

}
