package pl.comarch.patterns.singleton;

public enum EnumBasedSingleton {
	INSTANCE;
	private int counter =0 ;
	public void addOne(){
		counter++;
	}
	public int getCount(){
		return counter;
	}
}
