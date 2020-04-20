package services;

public class UsaImposto implements ServicoJuros {
	
	private double taxaJuros;

	public UsaImposto(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	@Override
	public double getServivoJuros() {
		return taxaJuros ;
	}

	

}
