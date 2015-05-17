package ProiectCTS;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtributiiAngajatBuilder angajat1 = new AtributiiAngajatBuilder().setConduceClientii("DA").setAduceMeniul("DA");
		AtributiiAngajatBuilder angajat2 = new AtributiiAngajatBuilder().setPreiaComanda("DA").setAduceComanda("DA").setAduceNota("DA");
		AtributiiAngajatBuilder angajat3 = new AtributiiAngajatBuilder().setCurataMasa("DA");
		AtributiiAngajat atrAng1= angajat1.build();
		AtributiiAngajat atrAng2= angajat2.build();
		AtributiiAngajat atrAng3= angajat3.build();
		System.out.println(atrAng1.toString());
		System.out.println(atrAng2.toString());
		System.out.println(atrAng3.toString());
	}

}
