package com.cdac.acts;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class SumOfDoubles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> dl = new ArrayList<>();
		
		int cnt=0;
		Double val = 0.0;
		do {
			System.out.print("Enter " + (cnt+1) + " number: ");
			val = sc.nextDouble();
			dl.add(val);
			cnt++;
		}while(cnt!=10);
		
		Double sum = 0.0;
		for(Double value : dl) {
			sum+=value;
		}
		
		System.out.println("\nSum is: " + sum);
		
		sc.close();
	}
}
