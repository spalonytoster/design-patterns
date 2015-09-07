package pl.comarch.patterns.prototype;
import java.util.Random;

public class PrototypeDemo {

	public static void main(String[] args) {
		
		Shape tmpShape = null;
		Shape prototype = null;
		Random random = new Random();
        if (random.nextBoolean()) {
            prototype = new Circle();
        } else {
            prototype = new Rectangle();
        }
        
        ShapeMachine sm = new ShapeMachine(prototype);
        for (int i = 0; i < 10; i++) {
			tmpShape = sm.makeShape();
			tmpShape.draw();
		}
	}

}
