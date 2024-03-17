package org.practice.tasks.ErlanC.coding_bat;

public class CanBalance {
    /*
    Учитывая непустой массив, верните значение true, если есть место для разделения массива таким образом,
     чтобы сумма чисел на одной стороне была равна сумме чисел на другой стороне.
     */

    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 2, 3, 1, 0, 1, 3}));
    }

    public static boolean canBalance(int[] nums) {
        int first = 0;
        int second = 0;

        for (int j = nums.length - 1; j >= 0; j--) {
            first += nums[j];
            for (int i = 0; i < nums.length; i++) {
                second += nums[i];
                if (first == second && Math.abs(i - j) == 1) {
                    return true;
                }
            }
            second = 0;
        }
        return false;
    }
}
