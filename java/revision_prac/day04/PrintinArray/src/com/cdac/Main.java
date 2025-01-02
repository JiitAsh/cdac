/* 
Create overloaded static methods for printing an array of String and Integers separately. Put these methods in ArrayPrinter class and call from main
ex.
public static void printArray(int[] arr) {}
public static void printArrray(String[] arr) {}
*/

package com.cdac;

public class Main {
	public static void printArray(int[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void printArray(String[] arr, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Hello Programmer :)");
		int arr[] = { 12, 23, 34, 67, 54 };
		String names[] = { "Jitesh", "Yash", "Ritik", "Ashish", "Yogi" };

		Main.printArray(arr, 5);
		Main.printArray(names, 5);
	}

}
