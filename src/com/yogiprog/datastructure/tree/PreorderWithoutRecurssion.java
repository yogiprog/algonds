package com.yogiprog.datastructure.tree;

import java.util.Stack;

public class PreorderWithoutRecurssion {

    public static void preorder(BTNode node){
        if(node ==null)
            return;
        Stack<BTNode> stack = new Stack<BTNode>();
        stack.add(node);

        while (stack.empty()==false){
            BTNode itr = stack.pop();
            System.out.println(itr.data);
            if(itr.left!=null)
                stack.add(itr.left);
            if(itr.right!=null)
                stack.add(itr.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
        PreorderWithoutRecurssion preRe = new PreorderWithoutRecurssion();
        preRe.preorder(root);
    }

}
