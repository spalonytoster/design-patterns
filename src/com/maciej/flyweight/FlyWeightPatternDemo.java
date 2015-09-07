package com.maciej.flyweight;

import java.util.Random;

final class Colors {
	
	private final static String[] COLORS = {"RED", "GREEN", "BLUE", "ORANGE", "PINK",
	"TURQOISE", "OLIVE", "YELLOW", "BROWN",
	"WHITE", "BLACK", "GREY", "PURPLE"};
	
	private final static int NUMBER_OF_COLORS = COLORS.length;
	
	public static int getNumberOfColors() {
		
		return NUMBER_OF_COLORS;
	}
	
	public static String getColor(int index) {
		
		//return (index < NUMBER_OF_COLORS ? COLORS[index] : "Error, wrong index.");
		return COLORS[index];
	}
}

public class FlyWeightPatternDemo {
	
	private static int limit = 100;
	private static Random random = new Random();
	private static int circlesToDraw = 10000;

	private static String getRandomColor() {
		
		Random random = new Random();
		
		return Colors.getColor(random.nextInt(Colors.getNumberOfColors()));
	}
	
	private static int getRandomCoordinate() {
		
		return random.nextInt(limit)+1;
	}

	
	public static void main(String[] args) {
				
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < circlesToDraw; i++) {
			
			Circle circle = new Circle(getRandomColor());

		}
				
//		for (int i = 0; i < circlesToDraw; i++) {
//			
//			Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
//
//		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("\nI've drawn " + circlesToDraw +
						   " circles in " + (endTime-startTime) + " milliseconds.");
	}

}
