package com.yogiprog.datastructure.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class DirectedGraphAdjacencyList {

  Map<Node, LinkedList<Node>> graph;

  DirectedGraphAdjacencyList() {
    graph = new HashMap<>();
  }

  public void addVertex(Node s, Node d) {
    if (graph.containsKey(s)) {
      graph.get(s).add(d);
    } else {
      LinkedList<Node> l = new LinkedList<>();
      l.add(d);
      graph.put(s, l);
    }
  }

  public void printGraph() {

    for (Node n : graph.keySet()) {
      System.out.print(n.data + ":");
      for (Node in : graph.get(n)) {
        System.out.print(in.data);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    DirectedGraphAdjacencyList dg = new DirectedGraphAdjacencyList();

    dg.addVertex(new Node(1), new Node(2));
    dg.addVertex(new Node(1), new Node(4));
    dg.addVertex(new Node(1), new Node(5));
    dg.addVertex(new Node(2), new Node(1));
    dg.addVertex(new Node(2), new Node(3));
    dg.addVertex(new Node(2), new Node(1));
    dg.addVertex(new Node(2), new Node(3));
    dg.addVertex(new Node(2), new Node(1));
    dg.addVertex(new Node(2), new Node(3));
    dg.addVertex(new Node(2), new Node(3));
    dg.printGraph();
  }

}
