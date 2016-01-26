package contin.mattia.commercialista.test;

import static org.junit.Assert.*;

import org.junit.Test;

import contin.mattia.commercialista.Imprenditore;

public class ImprenditoreTest extends Imprenditore{

	@Test
	public void test() {
		this.setFatture(101);
		assertEquals(501,getIncasso(),0);
	}

	public double getIncasso(){
		double incasso = 500;
		if(this.getFatture() > 100){
			incasso += (this.getFatture() - 100);
		}
		return incasso;
	}
	
}
