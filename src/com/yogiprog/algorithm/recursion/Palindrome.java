package com.yogiprog.algorithm.recursion;

public class Palindrome {

  public static boolean isPalindrome(String str) {

    if (str.length() == 1) {
      return true;
    }

    char[] strChar = str.toCharArray();
    int i = 0;

    System.out.println(str.length());
    System.out.println(str.length()/2);
    while (i <= ((strChar.length / 2))) {
        if (strChar[i] == strChar[strChar.length -1 - i])
         i++;
        else
         return false;
    }
      return true;
  }


  public static boolean isPalindrom(String str){

    if(str.length()<=1)
      return true;

   if(str.length()==2)
      if(str.charAt(0)==str.charAt(1))
        return true;
      else
        return false;

    if(str.charAt(0)==str.charAt(str.length()-1)&&isPalindrom(str.substring(1,str.length()-1)))
      return true;
    else
      return false;

  }



  public static void main(String[] args) {


    System.out.println(Palindrome.isPalindrome("abcdba"));

    System.out.println(Palindrome.isPalindrom("a"));
  }
}
