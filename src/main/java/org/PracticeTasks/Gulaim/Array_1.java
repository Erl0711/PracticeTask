package org.PracticeTasks.Gulaim;

public class Array_1 {
    public static void main(String[] args) {
                int[] nums1 = {1, 2, 6};
                int[] nums2 = {6, 1, 2, 3};
                int[] nums3 = {13, 6, 1, 2, 3};

                System.out.println(firstLast6(nums1)); // true
                System.out.println(firstLast6(nums2)); // true
                System.out.println(firstLast6(nums3)); // false
            }

            public static boolean firstLast6(int[] nums) {
                // Проверяем, если первый или последний элемент равен 6
                return nums[0] == 6 || nums[nums.length - 1] == 6;
            }
        }

