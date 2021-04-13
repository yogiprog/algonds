
package com.yogiprog.tree;

import com.yogiprog.datastructure.tree.BTNode;
import com.yogiprog.datastructure.tree.BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ordertraversal {

  public static List<List<Integer>> levelOrder(BTNode node) {

    List<List<Integer>> outer = new ArrayList<List<Integer>>();

    Queue<BTNode> q = new LinkedList<>();

    q.add(node);

    while (!q.isEmpty()) {

      List<Integer> list = new ArrayList<>();

      int size = q.size();

      for (int i = 0; i < size; i++) {
        BTNode n = q.remove();
        list.add(n.data);
        if (n.left != null) {
          q.add(n.left);
        }
        if (n.right != null) {
          q.add(n.right);
        }
      }
      outer.add(list);
    }
    return outer;
  }


  public static void main(String[] args) {

    BTNode node = BinaryTree.create12345tree();

    List<List<Integer>> result = Ordertraversal.levelOrder(node);

  }
}
