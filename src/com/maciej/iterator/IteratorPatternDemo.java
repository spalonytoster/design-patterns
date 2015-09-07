package com.maciej.iterator;

public class IteratorPatternDemo {

	public static void main(String[] args) {

		String[] names = {"Kerstin", "Isidro", "Tawanna",
						  "Chu", "Mallory", "Aida",
						  "Haywood", "Shawanna", "Wilson",
						  "Horacio"};
		
		NameRepository nameRepository = new NameRepository();
		nameRepository.setNames(names);
		
		Iterator iterator = nameRepository.getIterator();
		
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}

}
