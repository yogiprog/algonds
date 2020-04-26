package com.yogiprog.linkedlist;

public class Detectloop {

	public static void run(SLinkedList ll) {
		SNode Fptr = ll.head, Sptr = ll.head;
		int postion = 1;

		createLoop(ll, 3);
		while (Fptr.getNext() != null) {
			if (Fptr.getNext() == Sptr) {
				System.out.println("Loop found " + postion);
				break;
			}
			for(int i=0;i<=postion;i++)
				Sptr = Sptr.getNext();
			for(int i=0;i<=postion+1 && Fptr.getNext() !=null;i++)
				Fptr = Fptr.getNext();	

				postion++;
		}
		if(Fptr.getNext()==null)
			System.out.println("loop not found");
	
		
	}

	private static void createLoop(SLinkedList ll, int position) {
		SNode Fptr = ll.head, Sptr = ll.head;
		while (Fptr.getNext() != null) {
			if (position == 0) {
				Sptr = Sptr.getNext();
				Fptr = Fptr.getNext();
			} else {
				Fptr = Fptr.getNext();
				position--;
			}
		}
		Fptr.setNext(Sptr);
		System.out.println("exiting create loop");
	}
}
