package pl.comarch.patterns.strategy;

public class SmallTax implements TaxStrategy{

	@Override
	public void payTax(double price) {
		System.out.println("Small tax, only 18%. You have to pay:" + price*1.18);
	}

}
