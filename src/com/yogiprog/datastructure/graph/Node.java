package com.yogiprog.datastructure.graph;

public class Node {
  int data;

  Node(int data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object obj) {

    Node n = (Node)obj;
    if(this.data== n.data)
      return true;
    else
      return false;
  }

}
