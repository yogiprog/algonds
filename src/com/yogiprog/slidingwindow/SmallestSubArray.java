package com.yogiprog.slidingwindow;

public class SmallestSubArray {

  public static int getSizeOfSmallestSubarraywithsum(int[] arr, int s) {

    int result = 0;
    int minlength = Integer.MAX_VALUE;
    int sum = 0;
    int startWindow = 0;
    boolean isStartWindowset = false;

    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];

      if (sum >= s) {
        while (sum >= s) {
          minlength = Math.min(minlength, i - startWindow + 1);
          sum = sum - arr[startWindow];
          startWindow++;
        }
      }
    }
    return minlength == Integer.MAX_VALUE ? 0 : minlength;
  }
  public static void main(String[] args) {

    int[] arr = {2, 1, 5, 2, 3, 2};
    int s=7;
    System.out.println(">>>"+SmallestSubArray.getSizeOfSmallestSubarraywithsum(arr, s));
  }

}
