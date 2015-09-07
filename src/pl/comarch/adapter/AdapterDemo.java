/*
	Wzorzec projektowy Adapter jest uzywany wtedy, gdy chcemy zmusic do wspolpracy dwa niekompatabilne interfejsy. Uzycie tego wzoca projektowego nie wymusza zmiany kodu zrodlowego zadnej z klas.
*/

package pl.comarch.adapter;

public class AdapterDemo {

	public static void main(String[] args) {
		// uzywamy stosu nieswiadomi, ze jest on oparty na klasie ArrayList
		MyStack<Integer> myStack = new MyStack<Integer>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		
		System.out.println(myStack.top());
		myStack.pop();
		
		System.out.println(myStack.pop());
		System.out.println(myStack.pop());
	}
}