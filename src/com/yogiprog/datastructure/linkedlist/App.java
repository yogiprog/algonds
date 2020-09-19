package com.yogiprog.datastructure.linkedlist;

public class App {
	
	public static void main(String[] args) {
		
		SLinkedList ll = new SLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		
//		ll.display();
//		ReverseLL.reverse(ll);
//		System.out.println(">>>");
//		ll.display();
//		
//		
		Detectloop.run(ll);
		
		
		
//		try {
//			System.out.println("Node from last index  : "+FindNthNodeFromEnd.getNode(ll.head, 0).getData());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
