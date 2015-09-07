package com.maciej.iterator;

public class NameRepository implements Container {
	
	private String[] names;

	@Override
	public Iterator getIterator() {
		
		return new NameIterator();
	}
	
	public void setNames (String[] names) {
		
		this.names = names;
	}
	
	private class NameIterator implements Iterator {

		int index = 0;
		
		@Override
		public boolean hasNext() {
			
			if (index < names.length)
				return true;
			else 
				return false;
		}

		@Override
		public Object next() {
			
			if (this.hasNext())
				return names[index++];
			else
				return null;
		}

	}

}
