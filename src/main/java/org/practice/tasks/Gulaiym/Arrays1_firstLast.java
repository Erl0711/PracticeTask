package org.practice.tasks.Gulaiym;

//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//
//
//        firstLast6([1, 2, 6]) → true
//        firstLast6([6, 1, 2, 3]) → true
//        firstLast6([13, 6, 1, 2, 3]) → false
public class Arrays1_firstLast {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 6};
        int[] array2 = {6, 1, 2, 3};
        int[] array3 = {13, 6, 1, 2, 3};

        System.out.println("firstLast6([1, 2, 6]) → " + firstLast6(array1));
        System.out.println("firstLast6([6, 1, 2, 3]) → " + firstLast6(array2));
        System.out.println("firstLast6([13, 6, 1, 2, 3]) → " + firstLast6(array3));

    }public static boolean firstLast6(int[] nums) {
        return nums.length>=1 && (nums[0]==6 || nums[nums.length -1]==6);
    }

}
