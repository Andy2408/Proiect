package Patterns;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public  class Angajat implements IAngajat {
	public String nume;
	public String CNP;
	public String nrTelefon;
	public String email;
	
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

	
	//Test
	
	
	
	
	
	
}
