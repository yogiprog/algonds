package com.yogiprog.slidingwindow;

public class MaxSumSubArray {

  public  static  int getSum(int[] arr, int k){
    int sum =0;
    int startWindow =0 ;
    int result =0;
    for(int i = 0; i<arr.length;i++){
      sum = sum + arr[i];
      if(i>=k-1){
        if(sum > result)
          result = sum;
        sum = sum - arr[startWindow];
        startWindow++;
      }

    }
    return result;

  }

  public static void main(String[] args) {
    int[] arr = {2,1,5,1,3,2};
    int k = 3;

    System.out.println(MaxSumSubArray.getSum(arr,k));

  }
}
