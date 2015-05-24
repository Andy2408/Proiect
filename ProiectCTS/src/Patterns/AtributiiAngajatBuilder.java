package Patterns;

public class AtributiiAngajatBuilder implements IAtributiiAngajatBuilder {
	AtributiiAngajat atributii;
	
	public AtributiiAngajatBuilder(){
		this.atributii = new AtributiiAngajat();
	}
	
		
	public AtributiiAngajatBuilder setConduceClientii(String _conduceClientii) {
		atributii.setConduceClientii( _conduceClientii);
		return this;
	}



	public AtributiiAngajatBuilder setAduceMeniul(String _aduceMeniul) {
		atributii.setAduceMeniul (_aduceMeniul);
		return this;
	}



	public AtributiiAngajatBuilder setPreiaComanda(String _preiaComanda) {
		atributii.setPreiaComanda (_preiaComanda);
		return this;
	}



	public AtributiiAngajatBuilder setAduceComanda(String _aduceComanda) {
		atributii.setAduceComanda (_aduceComanda);
		return this;
	}



	public AtributiiAngajatBuilder setAduceNota(String _aduceNota) {
		atributii.setAduceNota (_aduceNota);
		return this;
	}



	public AtributiiAngajatBuilder setCurataMasa(String _curataMasa) {
		atributii.setCurataMasa (_curataMasa);
		return this;
	}



	@Override
	public AtributiiAngajat build() {
		return atributii;
	}

}
