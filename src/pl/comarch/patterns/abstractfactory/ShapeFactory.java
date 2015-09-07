package pl.comarch.patterns.abstractfactory;
import java.util.Random;

abstract class ShapeFactory {

	public static ShapeFactory getFactory(){
		Random random = new Random();
		int i=random.nextInt();
		if(i%3==0)
			return new CircleFactory();
		else if(i%3==1)
			return new TrinagleFactory();
		else
			return new RectangleFactory();
	}
	
	public abstract Shape createShape();
}
