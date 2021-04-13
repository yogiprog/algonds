package com.yogiprog.algorithm.dp;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestCommentSubsquenceIntwoArray {


  public void bruteForce(int[] arr1, int[] arr2) {

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

    for (int i = 0; i < arr1.length; i++) {
      ArrayList<Integer> list = new ArrayList<Integer>();
      int temp = i;
      for (int j = 0; j < arr2.length; j++) {
        if (list.size() == 0 && arr1[temp] == arr2[j]) {
          list.add(arr2[j]);
          temp++;
        }

        if (list.size() != 0 && arr2[j] > list.get(list.size() - 1)) {
          int index = findIndexofElement(arr1, temp + 1, arr2[j]);

          if (index != 0) {
            list.add(arr2[j]);
            temp=index;
          }
        }
      }
      map.put(new Integer(i),list);;

    }


    for(Integer i : map.keySet()){
      System.out.println(map.get(i).size());
    }
  }

  public Integer findIndexofElement(int[] arr, int startIndex, int element) {

    for (int i = startIndex; i < arr.length; i++) {
      if (arr[i] == element) {
        return i;
      }
    }
    return 0;
  }

    public int LCS(int[] arr1, int i, int[] arr2, int j){

    if(i==arr1.length-1 || j==arr2.length-1)
    return 0;
    else{
      if(arr1[i]==arr2[j])
        return 1+LCS(arr1,i+1, arr2,j+1);
       else
         return Math.max(LCS(arr1,i+1,arr2,j),LCS(arr1,i,arr2,j+1));

    }



    }


  public static void main(String[] args) {

    LongestCommentSubsquenceIntwoArray l = new LongestCommentSubsquenceIntwoArray();

    int[] arr1 = {13,12,14,15,1,2,3,4,5,6};
    int[] arr2= {13,14,1,2,3,4,5,6};

   // l.bruteForce(arr1,arr2);

    System.out.println(l.LCS(arr1,0,arr2,0));


  }
}
