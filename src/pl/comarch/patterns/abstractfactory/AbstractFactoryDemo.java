package pl.comarch.patterns.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		ShapeFactory sf;
		Shape shape;

		for (int i=0; i<10; i++){
			sf = ShapeFactory.getFactory();
			shape = sf.createShape();
			shape.drawShape();
		}

	}

}
