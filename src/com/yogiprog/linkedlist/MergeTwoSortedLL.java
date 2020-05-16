package com.yogiprog.linkedlist;

public class MergeTwoSortedLL {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	        
	        if(l1 ==null || l2 == null)
	            return l1!=null?l1:l2;

	        ListNode itr1 = l1, itr2 = l2;
	        
	        ListNode Nll = null;
	        ListNode Nitr = Nll;
	        while(itr1!=null || itr2!=null){
	            int c = itr1.data > itr2.data ? 1 : itr1.data <itr2.data ? 2 : 3;
	            switch (c) {
	            case 1:
	            	 if(Nll==null){
			                Nll=itr2;
			                Nitr = Nll;
		                 }else{
		                    Nitr.next=itr2;
		                    Nitr= Nitr.next;
		                }
		                   itr2 = itr2.next;
	            	break;
	            	
	            case 2 : 
	            	if(Nll==null){
		                Nll=itr1;
		                Nitr = Nll;
	                 }else{
	                    Nitr.next=itr1;
	                    Nitr= Nitr.next;
	                }
	                   itr1 = itr1.next;
	                   break;  
	                   
	            case 3 : 
	            	if(Nll==null){
		                Nll=itr1;
		                Nitr = Nll;
		                Nitr=Nitr.next;
		                Nitr=itr2;
		                Nitr = Nitr.next;;
	                 }else{
	                    Nitr.next=itr1;
	                    Nitr= Nitr.next;
	                    Nitr.next=itr2;
	                    Nitr= Nitr.next;
	                }
	                   itr1 = itr1.next;
	                   itr2 = itr2.next;
	                   break;
	            }
	        	
	        } 	
	        
	        return Nll;
	}	        	

}        

	 class ListNode {
     	int data;
     	ListNode next;
     }
