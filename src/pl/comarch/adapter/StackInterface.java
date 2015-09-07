package pl.comarch.adapter;

//interfejs przedstawiajacy stos, ktory bedzie reprezentowac adaptowana klase
public interface StackInterface<T> {
	void push(T o);
	T pop();
	T top();
}
