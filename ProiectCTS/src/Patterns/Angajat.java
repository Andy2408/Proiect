package Patterns;

public  class Angajat implements IAngajat {
	public String nume;
	public String CNP;
	public String nrTelefon;
	
	public Angajat() {
		super();
	}

	public Angajat(String nume, String CNP, String nrTelefon) {
		this.nume = nume;
		this.CNP = CNP;
		this.nrTelefon = nrTelefon;
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

	@Override
	public void oreSuplimentare() {
	}

	
	//Test
}
