package com.doublylinkedlist;

public class DLNode {
	int data;
	DLNode previous;
	DLNode next;
	
	public DLNode() {
	}
	
	public DLNode(int data) {
		this.data = data;
		previous=null;
		next=null;
	}
}
