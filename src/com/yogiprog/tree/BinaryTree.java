package com.yogiprog.tree;

import java.util.Stack;

public class BinaryTree {

    public BTNode createBT(int[] arr) {

        Stack<BTNode> stack = new Stack<BTNode>();
        int length = arr.length;
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




    public BTNode creatNode(int i) {
        BTNode node = new BTNode(i);
        return node;
    }

    public static BTNode create12345tree(){

        BTNode node = new BTNode(1);
        node.right=new BTNode(3);
        node.left= new BTNode(2);
        node.left.left= new BTNode(4);
        node.left.right = new BTNode(5);
        return node;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
    }
}

class BTNode {
    int data;
    BTNode left;
    BTNode right;

    BTNode(int i) {
        this.data = i;
        this.left = null;
        this.right = null;
    }
}
