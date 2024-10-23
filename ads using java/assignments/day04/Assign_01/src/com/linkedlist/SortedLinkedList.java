package com.linkedlist;

public class SortedLinkedList implements SortedListMethods {
	Node head;;
	Node tail;
	
	public SortedLinkedList() {
		head=null;
		tail=null;
	}
	
	@Override
	public void insert(int data) {
		// if list is empty
		if(head==null) {
			Node newNode = new Node(data);
			head=newNode;
			tail=newNode;
			return;
		}
		
		
		if(data<head.data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
			return;
		}
		
		if(data>=tail.data) {
			Node newNode = new Node(data);
			tail.next = newNode;
			tail = newNode;
			return;
		}
		
		Node previous = new Node();
		Node current = head;
		
		while(current!=null) {
			if(data<current.data) {
				Node newNode = new Node(data);
				newNode.next = current;
				previous.next = newNode;
				return;
			}
			previous = current;
			current = current.next;
		}
			
	}
	@Override
	public void delete(int data) {
		if(this.search(data)==true) {
			
			if(data==head.data) {
				Node temp = head;
				head = head.next;
				temp.next = null;
				System.out.println("Element deleted successfully!!");
				return;
			}
			
			Node previous = new Node();
			Node current = head;
			while(current!=null) {
				// check for tail
				if(data==current.data && current.next==null) {
					previous.next = current.next;
					tail=previous;
					System.out.println("Element deleted successfully!!");
					return;
				}
				if(data==current.data) {
					previous.next = current.next;
					current.next = null;
					System.out.println("Element deleted successfully!!");
					return;
				}
				previous = current;
				current = current.next;
			}
			
		}else {
			System.out.println("Element you want to delete is not present!!");
		}
		
	}
	@Override
	public void deleteAll(int data) {		
		if(this.search(data)) {
			Node current = head;
			Node previous = new Node();
			
			while(current!=null) {
				if(data==head.data) {
					head = head.next;
					// as current is pointing to old head so make old head's next as null
					current.next = null;
					current = head;
				}else if(data==current.data && current.next==null) {
					previous.next=current.next;
					tail = previous;
					System.out.println("All occurrences of given element deleted successfully!!");
					return;
				}else if(data==current.data) {
					previous.next = current.next;
					current.next = null;
					current = previous.next;
				}else {
					previous = current;
					current = current.next;
				}
				
				
			}
			
			System.out.println("All occurrences of given element deleted successfully!!");
			
		}else {
			System.out.println("Element you want to delete is not present!!");
		}
	}
	@Override
	public boolean search(int data) {
		if(this.isEmpty()) {
			return false;
		}
		
		Node current = head;
		while(current!=null) {
			if(data==current.data) {
				return true;
			}
			
			current=current.next;
		}
		return false;
	}
	@Override
	public void print() {
		if(this.isEmpty()) {
			System.out.println("Can not print, list is empty!!");
			return;
		}
		Node current = head;
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
