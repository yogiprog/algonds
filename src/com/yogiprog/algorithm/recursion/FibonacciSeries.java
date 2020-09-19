package com.yogiprog.algorithm.recursion;

public class FibonacciSeries {


  public static int FibonacciIteratively(int n) {

    int[] arr = new int[n];
    arr[0] = 0;
    arr[1] = 1;
    for (int i = 2; i < n; i++) {
      arr[i] = arr[i - 1] + arr[i - 2];
    }
    return arr[n - 1];
  }


  public static int fibonacciRecurrsively(int n) {

    if (n == 1) {
      return 1;
    }
    if (n == 0) {
      return 0;
    }

    return (fibonacciRecurrsively(n - 1) + fibonacciRecurrsively(n - 2));

  }


  public static void main(String[] args) {

   // System.out.println(FibonacciIteratively(4));

    System.out.println(fibonacciRecurrsively(4));


  }

}
