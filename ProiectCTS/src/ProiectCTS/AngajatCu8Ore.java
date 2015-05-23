package ProiectCTS;

public class AngajatCu8Ore extends Angajat{
	
	public AngajatCu8Ore() {
		this.nume="Mihai";
		this.CNP="1952222090032";
		this.nrTelefon="0724571357";
	}

	@Override
	public void oreSuplimentare() {
		System.out.println(super.nume + " trebuie sa vii la restaurant 8 ore pentru ca avem un eveniment privat in aceasta noapte");
		
	}
}
