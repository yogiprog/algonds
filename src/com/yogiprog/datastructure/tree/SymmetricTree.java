package com.yogiprog.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {


  public static boolean isSymmetric(BTNode node) {

    if (node == null) {
      return true;
    }

    Queue<BTNode> q1 = new LinkedList<>();
    Queue<BTNode> q2 = new LinkedList<>();

    q1.add(node.left);
    q2.add(node.right);

    while (!q1.isEmpty() && !q2.isEmpty()) {

      BTNode n1 = q1.poll();
      BTNode n2 = q2.poll();

      if ((n1 == null && n2 != null) || (n1 != null && n2 == null)) {
        return false;
      }

         /*   if(n1!=null){
                if(n1.val!=n2.val)
                    return false;
                q1.add(n1.left);O
                q1.add(n1.right);
                q2.add(n2.right);
                q2.add(n2.left);
            }
        }*/
      return true;
    }

    return true;
  }

  public static void main(String[] args) {

    BTNode bt = BinaryTree.create1223223tree();
    SymmetricTree st = new SymmetricTree();
    System.out.println(SymmetricTree.isSymmetric(bt));
  }
}