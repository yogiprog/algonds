package com.yogiprog.linkedlist;

public class FindNthNodeFromEnd {

	public static SNode getNode(SNode head, int position) throws Exception {
		
		if(position==0)
			throw new Exception("Invalid value for position");

		
		position--;
		SNode Sptr = head, Fptr = head;
		while (Fptr.getNext() != null) {
			if (position == 0) {
				Sptr = Sptr.getNext();
				Fptr = Fptr.getNext();
			} else {
				Fptr = Fptr.getNext();
				position--;
			}
		}
		if(position!=0)
			throw new Exception("LL is too short");
		
		
		return Sptr;
	}
}
