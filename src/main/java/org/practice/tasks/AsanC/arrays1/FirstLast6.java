package org.practice.tasks.AsanC.arrays1;

public class FirstLast6 {
    
    public static boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6){
            return true;
        }return false;
    }
}
