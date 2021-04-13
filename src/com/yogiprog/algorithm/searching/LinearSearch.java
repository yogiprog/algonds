package com.yogiprog.algorithm.searching;


public class LinearSearch {


    public int search(int[] arr, int num) {

        for (int i =0 ;i<arr.length;i++){
            if(arr[i]==num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        LinearSearch ls = new LinearSearch();
        System.out.println("Element found at index : "+ls.search(arr,5));
    }

}
