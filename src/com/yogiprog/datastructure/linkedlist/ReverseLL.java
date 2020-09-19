package com.yogiprog.datastructure.linkedlist;

public class ReverseLL {
	
	public static void reverse (SLinkedList ll) {
		SNode nextnode =null, temp= null;
		SNode head = ll.head;
		while(head!=null) {
			nextnode = head.getNext();
			head.setNext(temp); 
			temp = head;
			head = nextnode;
		}
		ll.head = temp;
	}

}
