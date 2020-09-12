package com.yogiprog.tree;

public class ValidateBinaryTree {

    public static boolean validateTree(BTNode root) {

        // zint max = root;
        if(root==null)
            return true;

        if(root.left!=null && root.left.data >root.data)
            return false;

        if(root.right!=null && root.right.data < root.data)
            return false;

        if(!validateTree(root.left)||!validateTree(root.right))
            return false;

        return true;

    }




    public static void main(String[] args) {
        System.out.println(new ValidateBinaryTree().validateTree(BinaryTree.create12345tree()));
        System.out.println(new ValidateBinaryTree().validateTree(BinaryTree.create42513tree()));
    }

}
