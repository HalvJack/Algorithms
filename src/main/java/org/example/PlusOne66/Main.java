package org.example.PlusOne66;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] plusOne(int[] digits){
       int a = 1;
       while(a <= digits.length && digits[digits.length - a] == 9)
       {
          digits[digits.length - a] = 0;
           a++;
       }
       if(a > digits.length)
       {
           int[] newArray = new int[a];
           newArray[0] = 1;
           for (int i = 0; i < newArray.length - 1; i++) {
               newArray[i+1] = digits[i];
           }
           return newArray;
       }
       else {
           digits[digits.length - a]++;
           return digits;
       }
    }
}
