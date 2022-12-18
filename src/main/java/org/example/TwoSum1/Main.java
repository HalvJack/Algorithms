package org.example.TwoSum1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] pairOfNumber = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int m = i + 1; m < nums.length; m++) {
                if (nums[i] + nums[m] == target && i != m) {
                    pairOfNumber[0] = nums[i];
                    pairOfNumber[1] = nums[m];

                }
            }

        }
        return pairOfNumber;
    }
}
