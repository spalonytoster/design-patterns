package com.maciej.bridge;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int x, int y, int radius) {

		System.out.println("Color = green" + ", x = " + x + ", y = " + y + ", radius = " + radius);
	}

}
