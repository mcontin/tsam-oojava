package contin.mattia.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.commercialista.Dipendente;

public class DipendenteTest extends Dipendente{

	@Test
	public void test() {
		assertEquals(50,getIncasso(),0);
	}

}
