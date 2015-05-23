package ProiectCTS;

public abstract class Angajat implements IAngajat {
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

	
	//Test
}
