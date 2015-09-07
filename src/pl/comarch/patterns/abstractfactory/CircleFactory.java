package pl.comarch.patterns.abstractfactory;

public class CircleFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Circle();
	}

}
