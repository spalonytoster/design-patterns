package com.maciej.interpreter;

public class InterpreterDemo {
	
	public InterpreterContext ic;
	
	public InterpreterDemo(InterpreterContext ic) {

		this.ic = ic;
	}
	
	public String interpret(String str) {
		
		Expression expression;
		
		if (str.contains("hexadecimal"))
			expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		else if (str.contains("binary"))
			expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		else return "Cannot interpret " + str + ". \nCan only interpret binary and hex.\n";
		
		return expression.interpret(ic);
	
	}
	
	public static void main (String[] args) {
		
		String str1 = "12 to binary";
		String str2 = "28 to hexadecimal";
		
		InterpreterDemo interpreterDemo = new InterpreterDemo(new InterpreterContext());
		System.out.println(str1 + " = " + interpreterDemo.interpret(str1));
		System.out.println(str2 + " = " + interpreterDemo.interpret(str2));
		
	}
}