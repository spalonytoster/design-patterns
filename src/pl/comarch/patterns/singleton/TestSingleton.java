package pl.comarch.patterns.singleton;

public class TestSingleton {

	EnumBasedSingleton enumBasedSingleton;
	
	public TestSingleton(){
		enumBasedSingleton = EnumBasedSingleton.INSTANCE;
	}
	
	public void test(){
		enumBasedSingleton.addOne();
		System.out.println(enumBasedSingleton.getCount());
		
	}
}
