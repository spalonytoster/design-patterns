package com.maciej.bridge;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {

		System.out.println("Color = red" + ", x = " + x + ", y = " + y + ", radius = " + radius);
	}

}
