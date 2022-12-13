package org.example.LongestCommonPrefix14;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldLongestPreixBefl(){
        //given
        String[] strs = {"flower", "flow", "flight"};
        Main main = new Main();
        //when
        String result = main.longestCommonPrefix(strs);
        //then
        Assertions.assertEquals("fl", result);
    }
    @Test
    public void shouldLongestPreixBeNull(){
        //given
        String[] strs = {"dog", "racecar", "car"};
        Main main = new Main();
        //when
        String result = main.longestCommonPrefix(strs);
        //then
        Assertions.assertEquals("", result);
    }

}