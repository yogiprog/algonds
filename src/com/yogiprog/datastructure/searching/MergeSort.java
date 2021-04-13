package com.yogiprog.datastructure.searching;

public class MergeSort {


  public static double median(int[] arr1, int[] arr2) {
    double answer = 0;

    int n = arr1.length;
    int m = arr2.length;
    int sizeOfArray = (n + m) ;
    int mid = (n+m)/2;


    int i = 0;
    int j = 0;

    int[] answerArray = new int[sizeOfArray];

    if (n > 0 && m > 0) {
      for (int k = 0; k < sizeOfArray; k++) {

        if (i < arr1.length) {
          if (arr1[i] <= arr2[j]) {
            answerArray[k] = arr1[i];
            i++;
          } else {
            answerArray[k] = arr2[j];
            j++;
          }
        } else {

          answerArray[k] = arr2[j];
          j++;
        }
      }
    } else {
      if (n > 0) {
        for (int k = 0; k < sizeOfArray; k++) {
          answerArray[k] = arr1[i];
          i++;
        }
      } else {
        for (int k = 0; k < sizeOfArray; k++) {
          answerArray[k] = arr2[j];
          j++;
        }
      }
    }

    if (((n + m) % 2) == 0) {

      answer =
          (float) (answerArray[mid] + answerArray[mid -1]) / 2;

    } else {

      answer = (float) (answerArray[mid+1]);
    }

    return answer;

  }

  public static void main(String[] args) {

    int[] arr1 = {1,3};
    int[] arr2 = {2};

    System.out.println(MergeSort.median(arr1, arr2));

  }

}
