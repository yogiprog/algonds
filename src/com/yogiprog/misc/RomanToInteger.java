package com.yogiprog.misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RomanToInteger {

  public void romanToInt(String s) {

    int num = 0;

    if (s.length() == 0 || "".equals(s) || s == null) {
      return;
    }

    Map<Character, Integer> map = new HashMap<Character, Integer>();

    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    Set<Integer> diff  = new HashSet<>();
    diff.add(4);
    diff.add(9);
    diff.add(900);


    char[] arr = s.toCharArray();

    for (int i = 0; i < arr.length; i++) {
        if (i < arr.length - 1) {
          int d  = map.get(arr[i+1])-map.get(arr[i]);
          System.out.println(">>>>"+d);
          if (diff.contains(map.get(arr[i+1])-map.get(arr[i]))) {
            num = num + (map.get(arr[i + 1]) - map.get(arr[i]));
            System.out.println(">>"+num);
            i = i+1;
          } else
            num = num + map.get(arr[i]);
        }
        else
          num = num + map.get(arr[i]);
      }
    System.out.println (num);
  }




  public static void main(String[] args) {

    RomanToInteger ri = new RomanToInteger();

    ri.romanToInt("IV");



  }

}
