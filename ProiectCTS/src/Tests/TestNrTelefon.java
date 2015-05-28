package Tests;
import Patterns.Angajat;
import junit.framework.TestCase;

public class TestNrTelefon extends TestCase {
	
	Angajat angajat;
	
//	public void setUp(){
//		System.out.println("setUp Unit test");
//		angajat = new Angajat("Andrei", "1930521090025", "0720104596");
//	}
	
	public void testNormalValues() throws Exception
	{
		Angajat angajat = new Angajat("Andrei", "1930521090025", "0720104560");
		assertTrue("Verificare cu valori normale",Angajat.isCorrectNrTel(angajat));			
	};
	
	public void testFirstNumberNot0() throws Exception
	{
		Angajat angajat = new Angajat("Andrei", "1930521090025", "7720104560");
		assertFalse("Verificare primul numar diferit de 0",Angajat.isCorrectNrTel(angajat));			
	};
	
	public void testContainsLetters() throws Exception
	{
		angajat = new Angajat("Andrei", "1930521090025", "0z20104560");
		assertFalse("Verificare daca numarul contine litere",angajat.isCorrectNrTel(angajat));			
	};
	
	public void testContainsOnlyLetters() throws Exception
	{
		angajat = new Angajat("Andrei", "1930521090025", "mansqorugl");
		assertFalse("Verificare daca numarul contine DOAR litere",angajat.isCorrectNrTel(angajat));			
	};
	
	public void testLongNumber() throws Exception
	{
		angajat = new Angajat("Andrei", "1930521090025", "07546982422");
		assertFalse("Verificare daca numarul e mai lung de 10 caractere",angajat.isCorrectNrTel(angajat));			
	};
	
	public void testShortNumber() throws Exception
	{
		angajat = new Angajat("Andrei", "1930521090025", "075469824");
		assertFalse("Verificare daca numarul e mai scurt de 10 caractere",angajat.isCorrectNrTel(angajat));			
	};
		
}

