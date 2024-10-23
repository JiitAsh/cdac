/*
 Assignment 1: For sorted singly linked list, implement

a) following function to delete the specified element
   void delete(int element);
b) following function to delete all occurrences of specified element
   void deleteAll(int element);
a) following function to return true if specified element is present in list else return false
   boolean search(int element);
Refer to the interface (SortedList) and partial implementation (class SortedSinglyList) done in class today.
*/
package com.linkedlist;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SortedLinkedList list = new SortedLinkedList();
		
		int option;
		do {
			System.out.print("\n*****Select Option*****\n"
							+ "1.Insert an element."
							+ "\n2.Delete an element."
							+ "\n3.Delete all occurrences of an element."
							+ "\n4.Search an element."
							+ "\n5.Print list."
							+ "\n0.Exit");
			
			System.out.print("\nSelect option: ");
			option = sc.nextInt();
			System.out.println();  // for line break;
			int element;
			switch(option) {
			case 1:{
				System.out.print("\nEnter element: ");
				element = sc.nextInt();
				list.insert(element);
			}break;
			case 2:{
				if(list.isEmpty()) {
					System.out.println("Can not delete, list is empty!!");
					break;
				}
				System.out.print("\nEnter element: ");
				element = sc.nextInt();
				list.delete(element);
			}break;
			case 3:{
				if(list.isEmpty()) {
					System.out.println("Can not delete, list is empty!!");
					break;
				}
				System.out.print("\nEnter element: ");
				element = sc.nextInt();
				list.deleteAll(element);
			}break;
			case 4:{
				if(list.isEmpty()) {
					System.out.println("Can not search, list is empty!!");
					break;
				}
				System.out.print("\nEnter element: ");
				element = sc.nextInt();
				if(list.search(element)) {
					System.out.println("Element is present in the list.");
				}else {
					System.out.println("Elemtn is not present in the list.");
				}
			}break;
			case 5:{
				list.print();
			}break;
			case 0:{
				System.out.println("Have a nice day :)");
			}break;
			}
		}while(option!=0);
		
		
		sc.close();
	}

}
