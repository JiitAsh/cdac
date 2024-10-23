package com.cdac.shape;

import com.cdac.shape.drawable.Drawable;

public class Rectangle extends Shape implements Drawable{
	
		private int length;
		private int breadth;
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double calculateArea() {
		return length * breadth;
	}
	
	@Override
	public double calculatePerimeter() {
		return 2 * (length + breadth);
	}

	@Override
	public void draw() {
		System.out.println("*******Draw method of a rectangle class*******\n");
		
	}
}
