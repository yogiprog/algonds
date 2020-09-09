package com.yogiprog.tree;

import jdk.nashorn.internal.ir.IdentNode;

public class InorderRecursion {


    public void Inorder(BTNode node) {

        if (node == null)
            return;

        Inorder(node.left);

        Inorder(node.right);

        System.out.println(node.data);
    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
        InorderRecursion ir = new InorderRecursion();
        ir.Inorder(root);

    }
}
