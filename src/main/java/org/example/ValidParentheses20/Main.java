package org.example.ValidParentheses20;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "{{[{}]}}()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stackOfSymbols = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stackOfSymbols.push(s.charAt(i));
            }
            else if ((s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')') && !stackOfSymbols.empty()) {
                if ((s.charAt(i) == '}' && stackOfSymbols.peek() == '{') ||
                        (s.charAt(i) == ']' && stackOfSymbols.peek() == '[') ||
                        (s.charAt(i) == ')' && stackOfSymbols.peek() == '(')) {
                    stackOfSymbols.pop();
                }
                else return false;
            }
            else return false;
        }
        return stackOfSymbols.empty();

    }


}
