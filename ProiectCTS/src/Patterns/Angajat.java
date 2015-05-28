package Patterns;

import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

import Exceptions.EroareSoldException;
import Exceptions.SalariuPreaMareException;
import Exceptions.SalariuPreaMicException;



public  class Angajat implements IAngajat {
	public String nume;
	public String CNP;
	public String nrTelefon;
	public String email;
	private double salariuAngajat;
	private List<Angajat> subalterni;
	public String departament;
	
	public Angajat() {
		super();
	}
	
	public Angajat(String nume, String CNP, String nrTelefon) {
		this.nume = nume;
		this.CNP = CNP;
		this.nrTelefon = nrTelefon;
	}
	
	public Angajat(String nume, String CNP, String nrTelefon, String email) {
		this.nume = nume;
		this.CNP = CNP;
		this.nrTelefon = nrTelefon;
		this.email=email;
	}
	
	public Angajat(String nume, String departament) {
		this.nume = nume;
		this.departament=departament;
		subalterni = new ArrayList<Angajat>();
	}
	
	public Angajat(double s) {
		this.salariuAngajat = s;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getCNP() {
		return CNP;
	}

	public void setCNP(String cNP) {
		CNP = cNP;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public void setNrTelefon(String nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalariuAngajat() {
		return salariuAngajat;
	}

	public void setSalariuAngajat(double salariuAngajat) {
		this.salariuAngajat = salariuAngajat;
	}

	
	public static boolean isCorrectNrTel(Angajat angajat)
	{
		if(angajat.nrTelefon.length() != 10)
		{
			return false;
		}
		if(!angajat.nrTelefon.startsWith("0"))
			return false;
		
		for(int i=0;i<angajat.nrTelefon.length();i++)
		{
			if(angajat.nrTelefon.charAt(i) > '9' || angajat.nrTelefon.charAt(i) < '0')
				return false;
		}
		return true;
	}
	
	
	public static boolean isCorrectCNP(Angajat angajat){
		if(angajat.CNP.length() != 13){
			return false;
		}
		
    	if(angajat.CNP.charAt(0) =='1' || angajat.CNP.charAt(0) =='2' || angajat.CNP.charAt(0) =='5' || angajat.CNP.charAt(0) =='6')
    		return true;
    	else    	
    	return false;
    }
	
	public static boolean isCorrectCNP2(String s){
		if(s.length() != 13){
			return false;
		}
		
    	if(s.charAt(0) =='1' || s.charAt(0) =='2' || s.charAt(0) =='5' || s.charAt(0) =='6')
    		return true;
    	else    	
    	return false;
    }
	

	@Override
	public void oreSuplimentare() {
	}

	public static boolean isCorrectEmail(String email){
        boolean isValidEmail = false;
 
       Pattern p = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);

       //Verific stringul dat cu patternul
       Matcher m = p.matcher(email);

       // verific daca s-a verificat
       boolean matchFound = m.matches();

       StringTokenizer st = new StringTokenizer(email, ".");
       
       String lastToken = null;
       
       while (st.hasMoreTokens()) {
          lastToken = st.nextToken();
       }

       if (matchFound && lastToken.length() >= 2 && email.length() - 1 != lastToken.length()) {
          isValidEmail = true;
       }
       else 
    	   isValidEmail = false;

    return isValidEmail;
	}
	
	public void marireSalariu() throws SalariuPreaMareException {
		setSalariuAngajat(this.getSalariuAngajat() + 100);
		if(salariuAngajat > 3000)
			throw new SalariuPreaMareException();
	}
	
	public void taiereSalariu() throws SalariuPreaMicException {
		setSalariuAngajat(this.getSalariuAngajat() - 100);
		if(salariuAngajat < 600)
			throw new SalariuPreaMicException();
	}
	
	public void adauga(Angajat a) {
		subalterni.add(a);
	}

	public void sterge(Angajat a) {
		subalterni.remove(a);
	}

	public List<Angajat> getSubalterni(){
		return this.subalterni;
	}
	
	public String toString(){
	      return ("Angajat :[ Nume : " + nume + ", Departament : " + departament + " ]");
	   }   
	
	//Test
	
	
	
	
	
	
}
