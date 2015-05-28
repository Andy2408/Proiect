package Tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import junit.framework.TestCase;
import Patterns.Angajat;

public class TestCNP extends TestCase {
	Angajat angajat;
	
	public void testNormalValues1() throws Exception
	{
		angajat = new Angajat("Andrei", "1930824090035", "0720104560");
		assertTrue("Verific daca incepe cu 1 ",angajat.isCorrectCNP(angajat));			
	};
	
	public void testNormalValues2() throws Exception
	{
		angajat = new Angajat("Andrei", "2930824090035", "0720104560");
		assertTrue("Verific daca incepe cu 2",angajat.isCorrectCNP(angajat));			
	};
	
	public void testNormalValues5() throws Exception
	{
		angajat = new Angajat("Andrei", "5930824090035", "0720104560");
		assertTrue("Verific daca incepe cu 5",angajat.isCorrectCNP(angajat));			
	};
	
	public void testNormalValues6() throws Exception
	{
		angajat = new Angajat("Andrei", "6930824090035", "0720104560");
		assertTrue("Verific daca incepe cu 6",angajat.isCorrectCNP(angajat));			
	};
	
	public void testLongCNP() throws Exception
	{
		angajat = new Angajat("Andrei", "69308240900355", "0720104560");
		assertFalse("Verificare CNP > 13 caractere",angajat.isCorrectCNP(angajat));			
	};
	
	public void testShortCNP() throws Exception
	{
		angajat = new Angajat("Andrei", "693082409003", "0720104560");
		assertFalse("Verificare CNP < 13 caractere",angajat.isCorrectCNP(angajat));			
	};
	
	public  void testCitire(){
		ArrayList<String>listaCnp = new ArrayList<String>();

		try {
			FileReader fr;
			fr = new FileReader("CNP.txt");
			BufferedReader in = new BufferedReader(fr);
			String str;
			while((str = in.readLine())!=null){
				String c[]= str.split(",");			
				for(int i = 0; i<c.length;i++)
					listaCnp.add(c[i]);
			}
		}
		catch (Exception e){
			System.out.println("Eroare");
		}
		for(String s : listaCnp){
			assertTrue(angajat.isCorrectCNP2(s));
			System.out.println(s); 
	}  
	}
}
