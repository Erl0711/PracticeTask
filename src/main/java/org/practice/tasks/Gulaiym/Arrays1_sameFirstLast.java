package org.practice.tasks.Gulaiym;

public class Arrays1_sameFirstLast {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, 1};
        int[] array3 = {1, 2, 1};

        System.out.println("sameFirstLast([1, 2, 3]) → " + sameFirstLast(array1));
        System.out.println("sameFirstLast([1, 2, 3, 1]) → " + sameFirstLast(array2));
        System.out.println("sameFirstLast([1, 2, 1]) → " + sameFirstLast(array3));
    }

    public static boolean sameFirstLast(int[] nums) {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }
}


