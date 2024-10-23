package com.cdac.shape.shapeTester;

import java.util.Scanner;
import com.cdac.shape.Circle;
import com.cdac.shape.Rectangle;
import com.cdac.shape.Shape;
public class ShapeTester {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. Calculate Area and Perimeter of circle");
			System.out.println("2. Calculate Area and Perimeter of Rectangle");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: 
			{	
					System.out.println("Enter radius of Circle: ");
					int radius = sc.nextInt();
				 	Shape s1 = new Circle(radius);
				 	System.out.println("Area of a circle having Radius " + radius + " is \n" + s1.calculateArea());
				 	System.out.println("Perimeter of a circle having Radius " + radius + " is \n" + s1.calculatePerimeter());
				 	//Down casting
				 	Circle c1 = (Circle) s1;
				 	c1.Draw();
			}break;
			case 2:
			{
				System.out.println("Enter Length of Rectangle: ");
				int length = sc.nextInt();
				System.out.println("Enter Breadth of Rectangle: ");
				int breadth = sc.nextInt();
			 	Shape s2 = new Rectangle(length, breadth);
			 	System.out.println("Area of a Rectangle having length " + length + "and breadth " +breadth+ " is \n" + s2.calculateArea());
			 	System.out.println("Perimeter of a Rectangle having length " + length + "and breadth " +breadth+ " is \n" + s2.calculatePerimeter());
			}break;
			default :
			{
				System.out.println("Please Enter Valid choice");
			}
			case 3:
			{
				System.exit(0);
			}
			}
		} while (choice != 3);
	}
}