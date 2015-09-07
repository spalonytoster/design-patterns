package pl.comarch.patterns.strategy;

public class Strategy {

	public static void main(String[] args) {
		Payer payer = new Payer();
		
		payer.setTaxStrategy(TaxStrategyTypes.BIG);
		payer.payTax(1000);
		
		payer.setTaxStrategy(TaxStrategyTypes.SMALL);
		payer.payTax(1000);
	}

}
