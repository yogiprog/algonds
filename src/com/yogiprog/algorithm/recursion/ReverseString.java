package com.yogiprog.algorithm.recursion;



public class ReverseString {

/*  public static void reverse(String str) {
    print(str, 0);
  }*/

/*  public static void print(String str, int i) {
    if (i == str.length()) {
      System.out.print(str.charAt(i - 1));
    } else {
      print(str, i + 1);
      if (i > 0) {
        System.out.print(str.charAt(i - 1));
      } else {
        return;
      }

    }

  }*/

  public static String printRecu(String str){
    System.out.println(str);

    if(str.length()==1) {

      return str;
    }
    else {

      StringBuffer sb = new StringBuffer(str.substring(str.length()-1,str.length()));
      System.out.println("***************"+sb.toString());
      String s = sb.append(printRecu(str.substring(0, str.length() - 1))).toString();
      System.out.println(">>>"+s);
      return s;
    }

  }


  public static void main(String[] args) {
    String str = "ABCD";

    System.out.println(ReverseString.printRecu(str));
  }

}