package Patterns;

import java.util.ArrayList;

import Exceptions.NuExistaAngajatException;

public class Departament {
	private ArrayList<Angajat> angajati = new ArrayList<Angajat>();

	public ArrayList<Angajat> getAngajati() {
		return angajati;
	}

	public void setAngajati(ArrayList<Angajat> angajati) {
		this.angajati = angajati;
	}
	
	public void adaugaAngajat(Angajat ang) {
		angajati.add(ang);
	}
	
	public void eliminaAngajat(Angajat a) throws NuExistaAngajatException {
		boolean removed = false;
		for (Angajat ang : angajati) {
			if (ang.equals(a)) {
				angajati.remove(a);
				removed = true;
				break;}
			
		}if (removed) {
			throw new NuExistaAngajatException();
		}

		angajati.remove(a);
	}
	
	public Angajat cautaAngajat(String nume){
		Angajat a = new Angajat();
		for(int i = 0; i<angajati.size();i++)
			if(angajati.get(i).getNume().equals(nume))  
				a=angajati.get(i); // dau rr la pc si porma te anunt iarp fb
		return a;
	}
	
	public ArrayList<Angajat> getLista() {
		return this.angajati;
	}
}
