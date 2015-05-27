package Tests;

import Exceptions.SalariuPreaMareException;
import Exceptions.SalariuPreaMicException;
import Patterns.Angajat;
import junit.framework.TestCase;

public class TestMarireTaiereSalariu extends TestCase {

	Angajat a = null;
	
	public void testAcordareMarireNormalValues() throws SalariuPreaMareException {
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		try{
			a.setSalariuAngajat(250);
			a.marireSalariu();
			assertTrue(250 < a.getSalariuAngajat());
		}
		catch(SalariuPreaMareException e){
			assertTrue(true);
		}
	
	}
	
	public void testTaiereNormalValues() throws SalariuPreaMicException {
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		try{
		a.setSalariuAngajat(600);
		a.taiereSalariu();
		assertTrue(600 > a.getSalariuAngajat());
		}
		catch(SalariuPreaMicException e){
			assertTrue(true);
		}

	}
	
	public void testTaiereLowValues() throws SalariuPreaMicException {
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		try{
		a.setSalariuAngajat(250);
		a.taiereSalariu();
		assertTrue(250 > a.getSalariuAngajat());
		}
		catch(SalariuPreaMicException e){
			assertTrue(true);
		}

	}
	
	public void testAcordareMarireHighValues() throws SalariuPreaMareException {
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		try{
			a.setSalariuAngajat(80000);
			a.marireSalariu();
			assertTrue(80000 < a.getSalariuAngajat());
		}
		catch(SalariuPreaMareException e){
			assertTrue(true);
		}
	
	}

}
