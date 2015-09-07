package pl.comarch.patterns.prototype;

public class ShapeMachine {

	private Shape shape;
	
	public ShapeMachine(Shape shape){
		this.shape = shape;
	}
	
	public Shape makeShape(){
		return (Shape) shape.clone();
	}
}
