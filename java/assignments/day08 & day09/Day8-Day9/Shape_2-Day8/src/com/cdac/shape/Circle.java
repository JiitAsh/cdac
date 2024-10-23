package com.cdac.shape;

import com.cdac.shape.drawable.Drawable;

public class Circle extends Shape implements Drawable{
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
	
	public void draw() {
		System.out.println("*******Draw method of a Circle class*******\n");
	}
}
