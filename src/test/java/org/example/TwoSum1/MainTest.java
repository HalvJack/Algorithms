package org.example.TwoSum1;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main main = new Main();
    //given
    int target = 9;
    int[] nums = {2,7,11,15};
    //when
    int[] result = main.twoSum(nums, target);
    //then
    int[] expected = {2,7};
    Assertions.assertEquals({expected, result);

}