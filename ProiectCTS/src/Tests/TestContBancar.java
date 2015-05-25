package Tests;

import Exceptions.EroareSoldException;
import Patterns.ContBancar;
import junit.framework.TestCase;

public class TestContBancar extends TestCase {
	ContBancar cont;
	
	public void setUp(){
		System.out.println("setUp");
		cont = new ContBancar(100);
	}
	
	public void testNormalValuesPrimesteSalariul() throws EroareSoldException {
		
		double expected = 1100;
		cont.primesteSalariul(1000);	
		assertEquals("Test adauga bani in cont",1100, cont.getSold(), 0);
	}
	
	public void testNormalValuesRetragere() {
		
		double expected = 90;
		try {
			cont.retragere(10);
		} 
		catch (EroareSoldException e) {
			
		}
		assertEquals("Test retrage bani din cont",90, cont.getSold(), 0);
	}
}
