package com.yogiprog.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DepthOfBinaryTree {

    public static int maxDepthRecursively(BTNode node)
    {
        if (node == null)
            return 0;
        else
        {
            int lDepth = maxDepthRecursively(node.left);
            int rDepth = maxDepthRecursively(node.right);

            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static int maxDepthIteratively(BTNode node) {

        if (node == null)
            return 0;
        Queue<BTNode> q = new LinkedList<>();
        q.add(node);
        int height = 0;

        while (1 == 1) {
            int nodeCount = q.size();
            if (nodeCount == 0)
                return height;
            height++;
            while (nodeCount > 0) {
                BTNode newnode = q.peek();
                q.remove();
                if (newnode.left != null)
                    q.add(newnode.left);
                if (newnode.right != null)
                    q.add(newnode.right);
                nodeCount--;
            }
        }
    }
    public static void main(String[] args) {
        BTNode node = BinaryTree.create12345tree();
        System.out.println(DepthOfBinaryTree.maxDepthRecursively(node));
        System.out.println(DepthOfBinaryTree.maxDepthIteratively(node));
    }
}
