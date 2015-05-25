package Patterns;

import Exceptions.EroareSoldException;

public class ContBancar {
	double sold;

	

	public ContBancar(double sold) {
		this.sold = sold;
	}
	
	public double getSold() {
		return sold;
	}
	
	public void primesteSalariul(double sumaPrimita) {		
		sold=sold+sumaPrimita;
	}
	
	public void retragere(double sumaRetrasa) throws EroareSoldException{		
		sold=sold-sumaRetrasa;
		if(sold < 10.0)
			throw new EroareSoldException();
	}
	
	
}
