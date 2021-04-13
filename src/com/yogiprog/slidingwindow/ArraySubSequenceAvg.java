package com.yogiprog.slidingwindow;

public class ArraySubSequenceAvg {

  public double[] getSubAvgArrayBF(int[] arr, int k) {
    double[] result = new double[arr.length - k + 1];
    double sum = 0;
    for (int i = 0; i < arr.length - k; i++) {

      for (int j = i; j < i + k; j++) {
        sum = sum + arr[j];
      }
      result[i] = sum / k;

      sum = 0;
    }

    return result;

  }


  public double[] getSubAvgArraySW(int[] arr, int k) {
    double[] result = new double[arr.length - k + 1];
    double sum = 0;
    int startResult = 0;

    for (int i = 0; i < arr.length; i++) {
      sum = sum + arr[i];

      if (i > k) {
        result[startResult] = sum / k;
        sum = sum - result[startResult];
        startResult++;
      }
    }

    return result;

  }


  public static void main(String[] args) {

    int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};

    ArraySubSequenceAvg a = new ArraySubSequenceAvg();

    double[] result = a.getSubAvgArraySW(arr, 5);

    for (double d : result) {
      System.out.println(d);
    }

  }

}
