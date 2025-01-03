/*
 Assignment 2: For doubly linked list, implement
a) following function to add specified element at the end list
   void addAtRear(int element);
a) following function to remove first node and return its value. Function should throw appropriate exception is list is empty.
   int deleteFirstNode();
Refer to the interface (DList) and partial implementation (class DoublyList) done in class today. 
 
 */
package com.doublylinkedlist;

public class Tester {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.addAtRear(12);
		list.addAtRear(34);
		list.addAtRear(30);
		
		list.print();
		
		int firstNodeValue = list.deleteFirstNode();
		if(firstNodeValue==-1) {
			System.out.println("Can not delete first node, list is empty!!");
		}else {
			System.out.println(firstNodeValue);
		}
		
		list.print();

	}

}
