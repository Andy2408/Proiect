package ProiectCTS;

public class AngajatCu4Ore extends Angajat{

	public AngajatCu4Ore() {
		this.nume="Andrei";
		this.CNP="1930825090032";
		this.nrTelefon="0724569832";
	}

	@Override
	public void oreSuplimentare() {
		System.out.println(super.nume + " trebuie sa vii la restaurant 4 ore pentru ca avem un eveniment privat in aceasta noapte");
		
	}

}
