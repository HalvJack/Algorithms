package org.example.ClimbingStairs70;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void shouldClimbingStairsBe8(){
        //given
        int n = 5;
        Main main = new Main();
        //when
        int result = main.climbingStairs(n);
        //then
        Assertions.assertEquals(8, result);
    }

}