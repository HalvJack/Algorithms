package org.example.ClimbingStairs70;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(climbingStairs(n));
    }

    static int climbingStairs(int n) {
        if(n == 0){
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbingStairs(n - 2) + climbingStairs(n - 1);
    }
}
