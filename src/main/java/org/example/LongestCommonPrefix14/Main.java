package org.example.LongestCommonPrefix14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String shortestLength = shortestName(strs);
        for (int i = 0; i < shortestLength.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(!(strs[0].charAt(i) == strs[j].charAt(i))){
                    return prefix;
                }
            }
            prefix+=strs[0].charAt(i);
        }
        return prefix;
    }
    private static String shortestName(String[] strs) {
        List<String> strings = Arrays.asList(strs);
        String shortestName = strs[0];
        for (String shortest : strings) {
            if (shortest.length() < shortestName.length()) {
                shortestName = shortest;
            }
        }
        return shortestName;
    }
}
