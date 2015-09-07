package com.maciej.chainofresponsibility;

public interface Chain {
		
	public void setNextChain (Chain chain);
	public void calculate (Numbers numbers);
}
