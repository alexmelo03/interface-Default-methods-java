package services;

public class BrazilImposto implements ServicoJuros {
	
	private double taxaJuros;

	public BrazilImposto(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	@Override
	public double getServivoJuros() {
		return taxaJuros;
	}

	

}
