package org.example.ValidParentheses20;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void shouldBeTrue(){
        //given
        String s = "{{[{}]}}()";
        //when
        Main main = new Main();
        boolean result = main.isValid(s);
        //then
        Assertions.assertEquals(true, result);
    }
}