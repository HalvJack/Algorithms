package org.example.TwoSum1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

class MainTest {
    @Test
    public void shouldBe9() {
        Main main = new Main();
        //given
        int target = 9;
        int[] nums = {2, 7, 11, 15};
        //when
        int[] result = main.twoSum(nums, target);
        //then
        int[] expected = {2, 7};
        Assert.assertArrayEquals(expected, result);
    }


}