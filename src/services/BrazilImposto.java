package services;

import java.security.InvalidParameterException;

public class BrazilImposto {
	
	private double taxaJuros;

	public BrazilImposto(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Os meses devem ser maiores que zero");
		}
		return amount * Math.pow(1.0 + taxaJuros / 100.0, months);
	}

}
