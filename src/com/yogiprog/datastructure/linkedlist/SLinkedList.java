package com.yogiprog.datastructure.linkedlist;

public class SLinkedList {

	public SNode head;

	SLinkedList() {
		this.head = null;
	}

	SLinkedList(int data) {
		this.head = new SNode(data);
	}

	// ADD operations - add(int data) (default), addLast(int data),
	// addAtPostion(int postion, int data)

	void add(int data) {
		SNode itr = this.head;
		SNode node = new SNode(data);
		if (itr != null) {
			while (itr.getNext() != null)
				itr = itr.getNext();
			itr.setNext(node);
		} else
			this.head = node;
	}

	void addLast(int data) {

		SNode itr = this.head;
		SNode node = new SNode(data);
		while (itr.getNext() != null)
			itr = itr.getNext();
		itr.setNext(node);

	}

	void addAtPostion(int data, int position) {

	}

	void display() {
		SNode itr = head;
		if (itr == null)
			System.out.println("Linked list is empty!");
		while (itr != null) {
			System.out.println(itr.getData());
			itr = itr.getNext();
		}
	}

	public void removeNthFromEnd(int n){

		SNode itr=  this.head;
		SNode middlePtr = this.head;
		SNode temp = this.head;

			for(int i=1;i<n;i++) {
				itr = itr.getNext();
			}

		while(itr!=null){

			    itr=itr.getNext();
				temp=middlePtr;
				middlePtr = middlePtr.getNext();
			}

		temp.setNext(middlePtr.getNext());

	}


	public static void main(String[] args) {
		SLinkedList SLL = new SLinkedList();
		SLL.add(1);
		SLL.add(2);
		SLL.add(3);
		SLL.add(4);
		SLL.display();
		SLL.removeNthFromEnd(1);
		SLL.display();
	}
}