package pl.comarch.patterns.decorator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

public class MaxNineSet extends AbstractSet<String>{

	Set<String> _set = null;
	
	MaxNineSet (Set<String> set){
		_set = set;
	}
	
	public boolean add (String s){
		if(s.length()>9)
			throw new UnsupportedOperationException("Too long string");
		return _set.add(s);
	}
	
	public Iterator<String> iterator() {
		return _set.iterator();
	}

	public int size() {
		return _set.size();
	}
	

}
