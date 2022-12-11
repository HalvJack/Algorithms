package org.example.PalindromNumber9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldMakePalindrom12321(){
        //given
        Main main = new Main();
        int x = 12321;
        //when
        boolean result = main.isPalindrome(x);
        //then
        Assertions.assertEquals(true, result);
    }
    @Test
    public void shouldMakePalindrom12401(){
        //given
        Main main = new Main();
        int x = 12401;
        //when
        boolean result = main.isPalindrome(x);
        //then
        Assertions.assertEquals(false, result);
    }

}