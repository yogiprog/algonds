package com.yogiprog.algorithm.recursion;

public class RecursionFactorial {

  public int factorialRecursively(int n) {
    if (n == 1) {
      return 1;
    }
    return factorialRecursively(n-1) * n;
  }


  public int factorialInteratively(int n) {

    int result = n;
    while (n > 1) {
      n--;
      result = result * (n);
    }
    System.out.println(result);
    return result;
  }


  public static void main(String[] args) {
    RecursionFactorial rf = new RecursionFactorial();
    rf.factorialInteratively(4);


    System.out.println(rf.factorialRecursively(4));
  }


}
