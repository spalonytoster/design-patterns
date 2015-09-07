package com.maciej.chainofresponsibility;

public class Numbers {

	private int a, b;
	private String calculationWanted;
	
	public Numbers (int a, int b, String calculationWanted) {
		
		this.a = a;
		this.b = b;
		this.calculationWanted = calculationWanted;
	}
	
	public int getA() { return a; }
	public int getB() { return b; }
	public String getCalculationWanted() { return calculationWanted; }
	
}
