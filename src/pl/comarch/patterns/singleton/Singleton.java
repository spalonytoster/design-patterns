package pl.comarch.patterns.singleton;

public class Singleton {

	public static void main(String[] args) {
		
		EnumBasedSingleton enumBasedSingleton = EnumBasedSingleton.INSTANCE;

		enumBasedSingleton.addOne();
		System.out.println(enumBasedSingleton.getCount());
		
		TestSingleton testSingleton = new TestSingleton();
		testSingleton.test();
		
		testSingleton = new TestSingleton();
		testSingleton.test();
		
		testSingleton = new TestSingleton();
		testSingleton.test();
		
		testSingleton = new TestSingleton();
		testSingleton.test();
		
		enumBasedSingleton.addOne();
		System.out.println(enumBasedSingleton.getCount());

	}
	
	

}
