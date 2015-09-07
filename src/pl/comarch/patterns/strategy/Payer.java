package pl.comarch.patterns.strategy;

public class Payer {
	private TaxStrategy taxStrategy;
	
	public void setTaxStrategy(TaxStrategyTypes taxStrategyType){
		switch (taxStrategyType){
			case BIG:
				this.taxStrategy = new BigTax();
				break;
			case SMALL:
				this.taxStrategy = new SmallTax();
				break;
			default:
				throw new IllegalArgumentException("Wrong tax strategy!!!");
		}
	}
	public void payTax (double price){
		taxStrategy.payTax(price);
	}
}
