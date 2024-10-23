package com.cdac.shape;

public class Rectangle extends Shape{
	
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
}
