package org.practice.tasks.Kani.Array1;

public class Sum2 {
    public static void main(String[] args) {

        Sum2 sum2 = new Sum2();
        int[] nums1 = {1, 2, 3}; // Ожидаемый результат: 3
        int[] nums2 = {1, 2};    // Ожидаемый результат: 3
        int[] nums3 = {1};       // Ожидаемый результат: 1
        int[] nums4 = {};        // Ожидаемый результат: 0

        System.out.println("Результат для nums1: " + sum2.sum2(nums1));
        System.out.println("Результат для nums2: " + sum2.sum2(nums2));
        System.out.println("Результат для nums3: " + sum2.sum2(nums3));
        System.out.println("Результат для nums4: " + sum2.sum2(nums4));

    }

    /* Учитывая массив целых чисел, верните сумму первых двух элементов массива.
    Если длина массива меньше 2, просто суммируйте существующие элементы, возвращая 0,
    если длина массива равна 0.
     */

    public int sum2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length >= 2){
            return nums[0] + nums[1];
        } else return nums[0];
    }
}

