package org.practice.tasks.zhyldyz;

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("the"));
        System.out.println(doubleChar("one"));
        System.out.println(doubleChar("tree"));
        System.out.println(doubleChar("-------"));
        System.out.println(lucky13(new int[]{1, 3, 5}));
        System.out.println(lucky13(new int[]{0, 8, 2}));
        System.out.println(lucky13(new int[]{2, 4, 1}));
        System.out.println(lucky13(new int[]{1, 8, 3}));

    }

    //Given a string, return a string where for every char in the original, there are two chars.
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return result;
    }

    //Given an array of ints, return true if the array contains no 1's and no 3's.
    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 || nums[i] == 1) {
                return false;
            }
        }
        return true;
    }
}

