package com.yogiprog.algorithm.dp;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

  static Map<Integer, Integer> table = new HashMap<>();

  public static int usingMemonization(int n) {

    if (n <= 1) {
      return n;
    }

    if (table.containsKey(n)) {
      return table.get(n);
    }

    int v = usingMemonization(n - 1) + usingMemonization(n - 2);
    table.put(n, v);

    return v;

  }

  public static int usingTabulation(int n) {

    table.put(0, 0);
    table.put(1, 1);

    for (int i = 2; i <= n; i++) {
      int result = table.get(i - 1);
      int result2 = table.get(i - 2);
      table.put(i, result + result2);
    }

    return table.get(n);

  }


  public static void main(String[] args) {

    Fibonacci f = new Fibonacci();

    //System.out.println(f.usingMemonization(6));
    System.out.println(f.usingTabulation(6));

  }

}
