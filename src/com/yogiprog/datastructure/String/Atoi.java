package com.yogiprog.datastructure.String;

public class Atoi {

  public int convertToInt(String str) {

    int INT_MAX = 2147483647;
    int INT_MIN = -2147483648;

    if(str.length()==0)
      return 0;

    String trim = str.trim();

    if(str.length()==0)
      return 0;
    StringBuilder removedWhiteSpace = new StringBuilder();

    for (int k =0 ; k<trim.length();k++)
    for(char c : trim.toCharArray()){
      if(c!=' ')
        removedWhiteSpace.append(c);
    }

    System.out.println("removed whitespace : "+ removedWhiteSpace);
    char[] strArr = removedWhiteSpace.toString().toCharArray();

    Boolean startOfNumber = false;

    int i = 0;

   /* while (!startOfNumber && i<strArr.length) {
      int ascii = (int) strArr[i];
      if ((ascii >= 49 && ascii <= 57)) {
        startOfNumber = true;
      }else{
        i++;
      }
    }
*/
    boolean negativeNum = false;


      if(strArr[i]=='-' || strArr[i]=='+') {
        if(strArr[i]=='-')
          negativeNum = true;
        i++;
      }

      if(i==strArr.length)
        return 0;

      int a = (int)strArr[i];
      if(!(a >= 48 && a <= 57))
        return 0;


    Boolean endOfNumber = false;
    StringBuilder answer  = new StringBuilder();

    if(negativeNum)
      answer.append('-');


    while(!endOfNumber && i<strArr.length){
      int ascii = (int) strArr[i];
      if (!(ascii >= 48 && ascii <= 57)) {

        endOfNumber=true;
      }else{
        System.out.println("answer" +i+"--" + answer);
        answer.append(strArr[i]);
        i++;
      }
    }
    System.out.println("answer" + answer);




    double finalAnswer  = Double.parseDouble(answer.toString());

    if(finalAnswer>INT_MAX)
      return INT_MAX;

    if (finalAnswer<INT_MIN)
      return INT_MIN;

    return (int)finalAnswer;
  }


  public static void main(String[] args) {

    Atoi a = new Atoi();
    System.out.println("final answer "+ a.convertToInt(" - 0000000000012345678"));

  }

}
