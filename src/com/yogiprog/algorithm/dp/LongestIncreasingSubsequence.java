package com.yogiprog.algorithm.dp;

public class LongestIncreasingSubsequence {

  public static int find(int[] arr) {

    int[] lis = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      lis[i] = 1;
    }

    for (int j = 1; j < arr.length; j++) {
      for (int i = 0; i < j; i++) {
        if (arr[j] > arr[i] && lis[j] < lis[i]+1) {
          lis[j] = lis[i] + 1;
        }
      }
    }

    int result = 0;

    for (int i : lis) {
      if (i > result) {
        result = i;
      }
      System.out.print(i);
    }

    return result;

  }

  public static void main(String[] args) {

    int[] arr = {10, 22, 9, 33, 21, 50, 41, 60};
    System.out.println(LongestIncreasingSubsequence.find(arr));
  }
}
