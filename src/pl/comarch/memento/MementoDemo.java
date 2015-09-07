/*
 * Wzorzec Memento, wzorzec czynnoœciowy u¿ywany do zapisu stanu obiektów, dziêki czemu mo¿liwe jest potem odtworzenie poprzedniego stanu.
 */

package pl.comarch.memento;

import java.util.Stack;
 
class Originator<T>{
	// obiekt ktorego stany bedziemy przechowywac
	private T o;
	
	// obiekt sluzacy do przechowywnaia stanow
	Memento<T> memento = new Memento<>();
	
	public void set(T o){
		this.o=o;
	}
	public T get(){
		return this.o;
	}
	
	public void saveState(){
		memento.save(o);
	}
	
	public void restoreState(){
		this.o=memento.restore();
	}
	
	// klasa implementujaca zapis/odczyt stanow
	public static class Memento<T>{
		Stack<T> items = new Stack<T>();
		
		private void save(T o){
			items.add(o);
		}
		private T restore(){
			return items.pop();
		}
	}
}
 
public class MementoDemo {

	public static void main(String[] args) {
		Originator<Integer> originator = new Originator<>();
		
		originator.set(new Integer(1));
		originator.saveState();
		
		originator.set(new Integer(2));
		originator.set(new Integer(3));
		originator.saveState();
		
		originator.set(new Integer(4));
		
		Integer i;
		
		originator.restoreState();
		i = originator.get();
		System.out.println(i);
		
		originator.restoreState();
		i = originator.get();
		System.out.println(i);
	}
}
