package pl.comarch.patterns.prototype;

public abstract class Shape implements Cloneable{

	abstract void draw();
	
	@Override
	public Object clone(){
		try{
			Shape copy = (Shape) super.clone();
			return copy;
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
			return null;
		}
	}
}
