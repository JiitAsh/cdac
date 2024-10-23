package com.cdac.shape;

public class Circle extends Shape {
	private final float PI = 3.14F;
	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * PI * radius;
	}
	
	public void Draw() {
		System.out.println("No need to draw real circle");
	}
}
