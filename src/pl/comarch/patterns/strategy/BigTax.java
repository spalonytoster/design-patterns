package pl.comarch.patterns.strategy;

public class BigTax implements TaxStrategy{

	@Override
	public void payTax(double price) {
		System.out.println("Big tax, 43%, nothing more. You have to pay:" + price*1.43);
	}

}
