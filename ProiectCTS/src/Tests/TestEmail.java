package Tests;

import Patterns.Angajat;
import junit.framework.TestCase;

public class TestEmail extends TestCase {
	
Angajat angajat;
	
	public void testNormalValues() throws Exception
	{
		assertTrue("Verificare cu valori normale email",angajat.isCorrectEmail("asd@yahoo.com"));			
	};
	
	public void testDoubleAt() throws Exception
	{
		assertFalse("Verificare dublu @",angajat.isCorrectEmail("as.@@gmail.com"));			
	};
	
	public void testDoubleCom() throws Exception
	{
		assertFalse("Verificare dublu .com",angajat.isCorrectEmail("as.@gmail.com.com"));			
	};
	
	public void testSymbolsAfterAt() throws Exception
	{
		assertFalse("Verificare simboluri dupa @",angajat.isCorrectEmail("as@%(*gmail.ro"));			
	};
	
	public void testDoublePoint() throws Exception
	{
		assertFalse("Verificare dublu .",angajat.isCorrectEmail("as..@gmail.com"));			
	};
	
	public void testNothingAfterAt() throws Exception
	{
		assertFalse("Verific daca dupa @ am punct ",angajat.isCorrectEmail("as@.com"));			
	};
	
	public void testNothingBeforeAt() throws Exception
	{
		assertFalse("Verific daca inainte de  @ nu am nimic ",angajat.isCorrectEmail("@gmail.com"));			
	};
	
	
	
}
