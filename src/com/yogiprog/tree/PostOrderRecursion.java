package com.yogiprog.tree;

public class PostOrderRecursion {

    public void postOrder(BTNode node) {

        if (node == null)
            return;

        postOrder(node.left);

        postOrder(node.right);

        System.out.println(node.data);


    }


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
        PostOrderRecursion preRe = new PostOrderRecursion();
        preRe.postOrder(root);

    }

}