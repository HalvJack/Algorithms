package org.example.PalindromNumber9;

public class Main {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int pomLength = s.length();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(pomLength - 1)){
                return false;
            }
            pomLength--;
        }
        return true;
    }
}