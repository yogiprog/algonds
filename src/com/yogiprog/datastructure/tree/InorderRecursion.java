package com.yogiprog.datastructure.tree;

public class InorderRecursion {

    public void Inorder(BTNode node) {
        if (node == null)
            return;
        Inorder(node.left);
        System.out.println(node.data);
        Inorder(node.right);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        BinaryTree bt = new BinaryTree();
        BTNode root = bt.createBT(arr);
        InorderRecursion ir = new InorderRecursion();
        ir.Inorder(root);
    }
}
