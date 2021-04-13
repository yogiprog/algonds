package com.yogiprog.datastructure.tree;

public class BTNode {
  public int data;
  public BTNode left;
  public BTNode right;

  BTNode(int i) {
    this.data = i;
    this.left = null;
    this.right = null;
  }
}