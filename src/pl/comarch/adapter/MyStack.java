package pl.comarch.adapter;

import java.util.ArrayList;

//adaptujemy klase ArrayList w taki sposob, aby mogly z niej korzystac klasy, ktore wymagaja interfejsu stosu
public class MyStack<T> extends ArrayList<T> implements StackInterface<T>{

	private static final long serialVersionUID = 3317263798039562698L;

	@Override
	public void push(T o) {
		super.add(o);
	}

	@Override
	public T top() {
		T o = super.get(super.size() - 1);
		return o;
	}
	
	@Override
	public T pop() {
		T o = top();
		super.remove(super.size() - 1);
		return o;
	}
}