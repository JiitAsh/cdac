package com.cdac.ArrList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListofDouble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> doubleList = new ArrayList<>(10);
		
		
		String ch;
		int cnt = 0;
		double val;
		do {
			System.out.print("Do you want to add element in list?(Y/N): ");
			ch = sc.nextLine();
			
			if(ch.equals("Y")) {
				System.out.print("Enter element: ");
				val = sc.nextDouble();
				doubleList.add(val);
				sc.nextLine();
				cnt++;
			}
		}while(!ch.equals("N") && cnt!=10);
		
		
		double sum=0;
		for(Double value : doubleList) {
			sum+=value;
		}
		
		System.out.println("Sum is: " + sum);
	}

}
