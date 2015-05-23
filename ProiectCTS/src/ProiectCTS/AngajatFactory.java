package ProiectCTS;


public class AngajatFactory {
	public Angajat getAngajat(Angajati tip){
		
		switch (tip){
		case cu4ore : return new AngajatCu4Ore();
		case cu8ore: return new AngajatCu8Ore();
		}
		return null;
	}
}
