package org.example.SearchInsertPosition35;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 4;
        System.out.println(SearchInsertPosition(nums, target));
    }
    public static int SearchInsertPosition(int[] nums, int target){
        int position = 0;
        int min = 0;
        int max = nums.length;
        while((min <= max) && position <=max)
        {
            position = (min+max)/2;
            if(position == nums.length){
                return position;
            }
            if(target > nums[position] && target < nums[position-1]){
                return position;
            }
            if(target == nums[position]){
                return position;
            }
            else if(target> nums[position]){
                min = position +1;

            }
            else max = position -1;
        }
        return position;
        /*for (int i = 0; i < nums.length; i++) {
            if(target > nums[i]){
                position++;
            }
            else if(target <= nums[i]){
                return position;
            }
        }
        return position;*/
    }
}
