package com.doublylinkedlist;

public class DoublyLinkedList implements DLListMethods{
	DLNode head;
	DLNode tail;
	
	public DoublyLinkedList() {
		head=null;
		tail=null;
	}

	@Override
	public void addAtRear(int element) {
		// check list is empty or not if yes then add at head
		if(head==null) {
			DLNode newNode = new DLNode(element);
			head=newNode;
			tail=newNode;
			return;
		}
		
		DLNode newNode = new DLNode(element);
		tail.next=newNode;
		newNode.previous=tail;
		tail=newNode;	
		
	}

	@Override
	public int deleteFirstNode() {
		if(this.isEmpty()) {
			return -1;
			
		}
		int firstNodeValue = head.data;
		// check if list contains only one node
		if(head.next==null) {
			head=head.next;
			return firstNodeValue;
		}
		
		DLNode temporaryNode = head;
		head=head.next;
		head.previous=null;
		temporaryNode.next=null;
		
		return firstNodeValue;
	}

	@Override
	public void print() {
		if(this.isEmpty()) {
			System.out.println("Can not print, list is empty!!");
			return;
		}
		
		DLNode current = head;
		
		while(current!=null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	@Override
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}
		return false;
	}
	
	
	
}
