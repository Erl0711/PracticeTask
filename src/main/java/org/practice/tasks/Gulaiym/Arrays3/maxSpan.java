package org.practice.tasks.Gulaiym.Arrays3;
//                Рассмотрим самое левое и самое правое появление некоторого значения в массиве.
//                Мы скажем, что «промежуток» — это количество элементов между ними включительно.
//                Единственное значение имеет диапазон 1. Возвращает наибольший диапазон,
//                найденный в данном массиве. (Эффективность не является приоритетом.)
//                maxSpan([1, 2, 1, 1, 3]) → 4
//                maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
//                maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
public class maxSpan {
    public static void main(String[] args) {
        // Создаем экземпляр класса, чтобы вызвать функцию maxSpan
        maxSpan max= new maxSpan();
        // Примеры тестовых данных
        int[] nums1 = {1, 2, 1, 1, 3};
        int[] nums2 = {1, 4, 2, 1, 4, 1, 4};
        int[] nums3 = {1, 4, 2, 1, 4, 4, 4};
        // Вызываем функцию maxSpan и выводим результаты
        System.out.println("maxSpan([1, 2, 1, 1, 3]): " + max.maxSpan(nums1));
        System.out.println("maxSpan([1, 4, 2, 1, 4, 1, 4]): " + max.maxSpan(nums2));
        System.out.println("maxSpan([1, 4, 2, 1, 4, 4, 4]): " + max.maxSpan(nums3));
    }
    public int maxSpan(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > max) {
                        max = span;
                    }
                    break;
                }
            }
        }
        return max;
    }
}