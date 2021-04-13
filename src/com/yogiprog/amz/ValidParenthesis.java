package com.yogiprog.amz;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {


  public static boolean isValidParentheis(String str) {

    if (str == null || "".equals(str)) {
      return true;
    }

    char[] parentehesisArr = str.toCharArray();

    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');

    Stack<Character> stack = new Stack<>();
    stack.add(parentehesisArr[0]);
    char c;
    for (int i = 1; i < parentehesisArr.length; i++) {

      if (!stack.isEmpty()) {
        c = stack.peek();
        if (map.containsKey(parentehesisArr[i]) && c == map.get(parentehesisArr[i])) {
          stack.pop();
        } else {
          stack.push(parentehesisArr[i]);
        }
      } else {
        stack.push(parentehesisArr[i]);
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(ValidParenthesis.isValidParentheis(""));
  }

}
