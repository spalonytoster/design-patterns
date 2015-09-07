package pl.comarch.patterns.abstractfactory;

public class RectangleFactory extends ShapeFactory {

	@Override
	public Shape createShape() {
		return new Rectangle();
	}

}
