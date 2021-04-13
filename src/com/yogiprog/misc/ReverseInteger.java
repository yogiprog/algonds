package com.yogiprog.misc;

public class ReverseInteger {

  public int reverse(int num) {
    // Handling negative numbers
    boolean negativeFlag = false;
    if (num < 0)
    {
      negativeFlag = true;
      num = -num ;
    }
    int prev_rev_num = 0, rev_num = 0;
    while (num != 0)
    {
      int curr_digit = num%10;
      rev_num = (rev_num*10) + curr_digit;
      if ((rev_num - curr_digit)/10 != prev_rev_num)
      {
        System.out.println("WARNING OVERFLOWED!!!");
        return 0;
      }
      prev_rev_num = rev_num;
      num = num/10;
    }
    return (negativeFlag == true)? -rev_num : rev_num;
  }
  public static void main(String[] args) {
    ReverseInteger r = new ReverseInteger();
    int result = r.reverse(1534236469);
    System.out.println(result);
  }
}
