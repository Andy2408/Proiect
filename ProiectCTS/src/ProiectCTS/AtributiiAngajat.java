package ProiectCTS;

public class AtributiiAngajat {
	String conduceClientii;
	 String aduceMeniul;
	 String preiaComanda;
	 String aduceComanda;
	 String aduceNota;
	 String curataMasa;
	
	public AtributiiAngajat(){
		conduceClientii ="-";
		aduceMeniul ="-";
		preiaComanda = "-";
		aduceComanda = "-";
		aduceNota = "-";
		curataMasa = "-";
	}

	public String getConduceClientii() {
		return conduceClientii;
	}

	public void setConduceClientii(String conduceClientii) {
		this.conduceClientii = conduceClientii;
	}

	public String getAduceMeniul() {
		return aduceMeniul;
	}

	public void setAduceMeniul(String aduceMeniul) {
		this.aduceMeniul = aduceMeniul;
	}

	public String getPreiaComanda() {
		return preiaComanda;
	}

	public void setPreiaComanda(String preiaComanda) {
		this.preiaComanda = preiaComanda;
	}

	public String getAduceComanda() {
		return aduceComanda;
	}

	public void setAduceComanda(String aduceComanda) {
		this.aduceComanda = aduceComanda;
	}

	public String getAduceNota() {
		return aduceNota;
	}

	public void setAduceNota(String aduceNota) {
		this.aduceNota = aduceNota;
	}

	public String getCurataMasa() {
		return curataMasa;
	}

	public void setCurataMasa(String curataMasa) {
		this.curataMasa = curataMasa;
	}

	@Override
	public String toString() {
		return "AtributiiAngajat------> conduceClientii:" + conduceClientii + " aduceMeniul:" + aduceMeniul + " preiaComanda:"
				+ preiaComanda + " aduceComanda:" + aduceComanda + " aduceNota:" + aduceNota + " curataMasa:" + curataMasa;
	}
	
	
	
}
