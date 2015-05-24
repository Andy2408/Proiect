package Patterns;

public class Test {

	public static void main(String[] args) {
		// ~~~~~~~~Builder~~~~~~~~
		AtributiiAngajatBuilder angajat1 = new AtributiiAngajatBuilder().setConduceClientii("DA").setAduceMeniul("DA");
		AtributiiAngajatBuilder angajat2 = new AtributiiAngajatBuilder().setPreiaComanda("DA").setAduceComanda("DA").setAduceNota("DA");
		AtributiiAngajatBuilder angajat3 = new AtributiiAngajatBuilder().setCurataMasa("DA");
		AtributiiAngajat atrAng1= angajat1.build();
		AtributiiAngajat atrAng2= angajat2.build();
		AtributiiAngajat atrAng3= angajat3.build();
		System.out.println(atrAng1.toString());
		System.out.println(atrAng2.toString());
		System.out.println(atrAng3.toString());
		//~~~~~~~~End Builder~~~~~~~~
		
		// ~~~~~~~~Factory~~~~~~~~
		AngajatFactory factory = new AngajatFactory();
		
		Angajat a1 = factory.getAngajat(Angajati.cu4ore);
		a1.oreSuplimentare();
		
		Angajat a2 = factory.getAngajat(Angajati.cu8ore);
		a2.oreSuplimentare();
		//~~~~~~~~End Factory~~~~~~~~
	}

}
