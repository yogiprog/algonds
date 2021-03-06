package com.yogiprog.datastructure.tree;

import java.util.Stack;

public class BinaryTree {

  public BTNode createBT(int[] arr) {

    Stack<BTNode> stack = new Stack<>();
    BTNode root = creatNode(arr[0]);
    stack.push(root);
    for (int i = 1; i <= arr.length - 1; i++) {
      BTNode temp = stack.pop();
      if (temp.right == null) {
        temp.right = creatNode(arr[i]);
        stack.push(temp);
      } else {
        if (temp.left == null) {
          temp.left = creatNode(arr[i]);
          stack.push(temp.left);
          stack.push(temp.right);
        }
      }
    }
    return root;
  }

  private BTNode creatNode(int i) {
    return new BTNode(i);
  }

  public static BTNode create12345tree() {

    BTNode node = new BTNode(1);
    node.right = new BTNode(3);
    node.left = new BTNode(2);
    node.left.left = new BTNode(4);
    node.left.right = new BTNode(5);
    return node;
  }


  public static BTNode create42513tree() {

    BTNode node = new BTNode(4);
    node.right = new BTNode(5);
    node.left = new BTNode(2);
    node.left.left = new BTNode(1);
    node.left.right = new BTNode(3);
    return node;
  }

  public static BTNode create1223223tree() {

    BTNode node = new BTNode(1);
    node.right = new BTNode(2);
    node.left = new BTNode(2);

    node.left.left = new BTNode(3);
    node.left.right = new BTNode(2);

    node.right.right = new BTNode(3);
    node.right.left = new BTNode(2);

    return node;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    BinaryTree bt = new BinaryTree();
    BTNode root = bt.createBT(arr);
  }
}
