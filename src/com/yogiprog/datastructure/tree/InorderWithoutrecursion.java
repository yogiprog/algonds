package com.yogiprog.datastructure.tree;

import java.util.Stack;

public class InorderWithoutrecursion {


    public void inorder(BTNode node){

        if(node ==null)
            return;

        Stack<BTNode> stack = new Stack<BTNode>();
        BTNode cur = node;

        while (cur !=null|| stack.size()>0){

            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            System.out.println(cur.data);
            cur = cur.right;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        InorderWithoutrecursion inRec = new InorderWithoutrecursion();
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
        inRec.inorder(root);
    }

}
