package com.maciej.chainofresponsibility;

public class DivideNumbers implements Chain {

private Chain nextChain;
	
	@Override
	public void setNextChain(Chain chain) {
		
		this.nextChain = chain;
	}
	
	@Override
	public void calculate(Numbers numbers) {

		if (numbers.getCalculationWanted().equals("/"))
			System.out.println(numbers.getA() + " / " + numbers.getB() + " = " +
					(1.0*numbers.getA()/numbers.getB()));
		
		else System.out.println("Only works for: \"+\", \"-\", \"*\", \"/\".");
	}

}
