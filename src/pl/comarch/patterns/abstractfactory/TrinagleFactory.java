package pl.comarch.patterns.abstractfactory;

public class TrinagleFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Triangle();
	}

}
