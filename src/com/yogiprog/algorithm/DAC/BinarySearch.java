package com.yogiprog.algorithm.DAC;

public class BinarySearch {


  public void search(int[] arr, int num){


    System.out.println(DAC(arr,num, 0,arr.length));

  }

  public int DAC(int[] arr, int num, int start, int end){

    int mid = ((end+start-1)/2);
    if(arr[mid]==num)
      return mid;

    if(arr[mid]>num)
       return DAC(arr,num,start,mid-1);
     else
      return DAC(arr,num,mid+1,end);

  }



  public static void main(String[] args) {

    int[] arr = {1,2,3,4,5,6,7,8,9,10};

    BinarySearch bs = new BinarySearch();

    bs.search(arr,5);

  }

}
