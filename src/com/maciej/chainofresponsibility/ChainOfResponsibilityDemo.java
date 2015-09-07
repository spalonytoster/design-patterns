package com.maciej.chainofresponsibility;

public class ChainOfResponsibilityDemo {
	
	public static void main (String[] args) {
		
		Numbers numbers = new Numbers(3, 5, "dfs");
		
		Chain chain1 = new AddNumbers();
		Chain chain2 = new SubtractNumbers();
		Chain chain3 = new MultiplyNumbers();
		Chain chain4 = new DivideNumbers();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		chain3.setNextChain(chain4);
		
		chain1.calculate(numbers);
	}

}
