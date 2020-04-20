package services;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	
	double getServivoJuros();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Os meses devem ser maiores que zero");
		}
		return amount * Math.pow(1.0 + getServivoJuros() / 100.0, months);
	}

}
