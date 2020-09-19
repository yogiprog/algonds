package com.yogiprog.algorithm.recursion;

public class ReverseString {

  public static void reverse(String str) {
    print(str, 0);
  }

  public static void print(String str, int i) {
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

  }

  public static void main(String[] args) {
    String str = "ABCD";
    ReverseString.reverse(str);
  }

}