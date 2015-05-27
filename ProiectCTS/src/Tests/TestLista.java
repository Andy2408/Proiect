package Tests;

import Exceptions.NuExistaAngajatException;
import Exceptions.SalariuPreaMicException;
import Patterns.Angajat;
import Patterns.Departament;
import junit.framework.TestCase;

public class TestLista extends TestCase {
	Angajat a;
	
	public void testAdaugaAngajat() {
		Departament d = new Departament();
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		Angajat a2 = new Angajat("Andrei", "1930521090025", "0720104560");
		d.adaugaAngajat(a);
		d.adaugaAngajat(a2);
		assertEquals("Testare adauga angajat",d.getLista().size(), 2);
	}
	
	public void testEliminaAngajat() throws NuExistaAngajatException {
		Departament d = new Departament();
		try{
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		d.eliminaAngajat(a);
		assertEquals("Testare elimina angajat",d.getLista().size(), 0);
		}
		catch(NuExistaAngajatException e){
			assertTrue(true);
		}
	}
	
	public void testEliminaAngajat2() throws NuExistaAngajatException {
		Departament d = new Departament();
		try{
		d.eliminaAngajat(a);
		assertEquals("Testare daca nu am angajat pentru a-mi arunca exceptie",d.getLista().size(), 0);
		}
		catch(NuExistaAngajatException e){
			assertTrue(true);
		}
	}
	
	public void testSimpleCautaAngajat()  {
		Departament d = new Departament();
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		d.adaugaAngajat(a);
		d.cautaAngajat("Andrei");
		assertEquals("Testare cautare",d.getLista().size(), 1);
	}
	
	public void testMultipleCautaAngajat()  {
		Departament d = new Departament();
		a = new Angajat("Andrei", "1930521090025", "0720104560");
		Angajat a2 = new Angajat("And", "1930521090025", "0720104560");
		Angajat a3 = new Angajat("Mirel", "1930521090025", "0720104560");
		Angajat a4 = new Angajat("Alex", "1930521090025", "0720104560");
		Angajat a5 = new Angajat("Andrei", "1930521090025", "0720104560");
		d.adaugaAngajat(a);
		d.adaugaAngajat(a2);
		d.adaugaAngajat(a3);
		d.adaugaAngajat(a4);
		d.adaugaAngajat(a5);
		Angajat b  = d.cautaAngajat("Andrei");
		assertEquals("Andrei", b.getNume()); 
	}
}





