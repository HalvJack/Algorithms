package org.example.PlusOne66;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    @Test
    public void shouldBe124(){
        //given
        int[] digits = {1,2,3};
        //when
        int[] result = main.plusOne(digits);
        //then
        int[] expected = {1, 2, 4};
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void shouldBe10(){
        //given
        int[] digits = {9};
        //when
        int[] result = main.plusOne(digits);
        //then
        int[] expected = {1, 0};
        Assert.assertArrayEquals(expected, result);
    }
    @Test
    public void shouldBe125000(){
        //given
        int[] digits = {1,2,4,9,9,9};
        //when
        int[] result = main.plusOne(digits);
        //then
        int[] expected = {1, 2,5,0,0,0};
        Assert.assertArrayEquals(expected, result);
    }

}