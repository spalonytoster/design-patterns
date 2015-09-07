package com.maciej.chainofresponsibility;

public class MultiplyNumbers implements Chain {

	private Chain nextChain;
	
	@Override
	public void setNextChain(Chain chain) {
		
		this.nextChain = chain;
	}
	
	@Override
	public void calculate(Numbers numbers) {

		if (numbers.getCalculationWanted().equals("*"))
			System.out.println(numbers.getA() + " * " + numbers.getB() + " = " +
					(numbers.getA()*numbers.getB()));
		
		else nextChain.calculate(numbers);
	}

}
