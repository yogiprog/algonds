package com.yogiprog.misc;

import java.util.HashMap;
import java.util.Map;

public class IntegertoRoman {

  public void convertIntToRoman(int num){

    StringBuilder str = new StringBuilder();

    if(num==0)
      return ;

    Map<Character,Integer> map = new HashMap<Character, Integer>();
    map.put('I',1);
    map.put('V',5);
    map.put('X',10);
    map.put('L',50);
    map.put('C',100);
    map.put('D',500);
    map.put('M',1000);

    while(num>0){
      int remainder = num%10;

      if(remainder-5<=3){
        while(remainder!=0) {
          str.append(map.get(1));
          remainder--;
        }
      }

    }

    System.out.println(num);
  }

  public static void main(String[] args) {

  }

}
