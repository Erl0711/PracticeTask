package org.practice.tasks.Gulaiym.Arrays3;
    /*    Возвращает массив, содержащий точно такие же числа,
        что и заданный массив, но переставленный так,
        чтобы за каждой тройкой сразу следовала четверка.
        Не перемещайте тройки, но любое другое число может перемещаться.
        Массив содержит одинаковое количество троек и четверок, после каждой тройки идет число,
        отличное от тройки, а цифра 3 появляется в массиве раньше любой четверки.
        fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        fix34([3, 2, 2, 4]) → [3, 4, 2, 2]*/
    public class fix34 {
    public static void main(String[] args) {
        int[] testArray = {1, 3, 1, 4};
        System.out.println("Исходный массив:");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nРезультат после вызова метода fix34:");
        int[] resultArray = fix34(testArray);
        for (int num : resultArray) {
            System.out.print(num + " ");
        }
    }
    public static int[] fix34(int[] nums) {
            int i = 0;
            while(i < nums.length && nums[i] != 3)
                i++;
            int j = i + 1;
            while(j < nums.length && nums[j] != 4)
                j++;
            while(i < nums.length) {
                if(nums[i] == 3) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[j];
                    nums[j] = temp;
                    while(j < nums.length && nums[j] != 4)
                        j++;
                }
                i++;
            }
            return nums;
        }
        }

