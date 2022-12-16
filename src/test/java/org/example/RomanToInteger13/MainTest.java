package org.example.RomanToInteger13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldBe1999(){
        //given
        Main main = new Main();
        //when
        int result = main.romanToInt("MCMXCIX");
        //then
        Assertions.assertEquals(1999,result);
    }

}