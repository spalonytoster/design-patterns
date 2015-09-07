package pl.comarch.patterns.decorator;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OnlyNumberSet extends AbstractSet<String> {

	private Set<String> _set = null;
	
	public OnlyNumberSet(Set<String> set) {
		_set = set;
	}
	
	public boolean checkOnlyNumber (String s){
		Character[] numbers = {'1','2','3','4','5','6','7','8','9'};
	    Set<Character> numbersSet = new HashSet<Character>(Arrays.asList(numbers));
	    for(int i=0; i<s.length(); i++) {
	        if(!numbersSet.contains(s.charAt(i)))
	            return false;
	    }		
		return true;
	}
	
	public boolean add(String s){
		if(!checkOnlyNumber(s))
            throw new UnsupportedOperationException("Not a number: "+s);
		return _set.add(s);
	}
	
	@Override
	public Iterator<String> iterator() {
		return _set.iterator();
	}

	@Override
	public int size() {
		return _set.size();
	}

}
