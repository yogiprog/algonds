package com.yogiprog.amz;

public class MergeKSortedLists {


  public ListNode mergeKLists(ListNode[] list) {

    ListNode head = list[0];

    ListNode min = list[0];

    int index = 0;

    return head;

  }

  public static void main(String[] args) {

    ListNode[] list = new ListNode[4];

    int[] arr1 = {3, 4, 5};
    int[] arr2 = {6, 7};
    int[] arr3 = {1, 2};
    int[] arr4 = {98, 99};

    LinkedList l1 = new LinkedList();
    LinkedList l2  = new LinkedList();
    LinkedList l3  = new LinkedList();
    LinkedList l4 = new LinkedList();

    l1.intWithArray(arr1);
    l2.intWithArray(arr2);
    l3.intWithArray(arr3);
    l4.intWithArray(arr4);

    l1.displayList();
    l2.displayList();
    l3.displayList();
    l4.displayList();



  }

}


class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }

}

class LinkedList{
   ListNode head;


   LinkedList(int val) {
    this.head.val = val;
    this.head.next = null;
  }

  LinkedList() {
    this.head = null;
  }



  ListNode intWithArray( int[] arr) {

    ListNode itr = this.head;
    for (int i : arr) {
      if (this.head == null) {
         this.head = new ListNode(i);
          itr = head;
      } else {
        itr.next = new ListNode(i);
        itr = itr.next;
      }
    }
    return  head;
  }

  void displayList() {
    ListNode itr = this.head;
    while (itr != null) {
      System.out.print(itr.val);
      itr = itr.next;
    }
    System.out.println();
  }
}
