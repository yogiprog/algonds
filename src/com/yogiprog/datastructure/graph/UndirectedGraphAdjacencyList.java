package com.yogiprog.datastructure.graph;

import java.util.ArrayList;

public class UndirectedGraphAdjacencyList {
  private ArrayList<ArrayList<Node>> graph ;
  UndirectedGraphAdjacencyList(){
    this.graph = new ArrayList<ArrayList<Node>>();
  }
  public void addNode(int data, int from){
      ArrayList<Node> temp = graph.get(from);
      temp.add(new Node(data));
  }

  public void display(){
    System.out.println(">>>>>>>>>>>>>>>>>>>");
    for(ArrayList<Node> list : graph){
      for (Node n : list){
        System.out.println(n.data);
      }
    }
  }

  public static void main(String[] args) {
    UndirectedGraphAdjacencyList g = new UndirectedGraphAdjacencyList();
    System.out.println(">>>>>>>>>>>>>>>>>>>");
    g.addNode(1,2);
    g.display();
  }


}


