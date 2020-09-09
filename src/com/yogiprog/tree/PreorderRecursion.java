package com.yogiprog.tree;

public class PreorderRecursion {


    public void preorder(BTNode node){

        if (node == null)
            return;

        System.out.println(node.data);

        preorder(node.left);

        preorder(node.right);


    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
        PreorderRecursion preRe = new PreorderRecursion();
        preRe.preorder(root);

    }
}
