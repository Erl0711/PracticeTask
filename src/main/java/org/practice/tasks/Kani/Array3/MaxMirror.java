package org.practice.tasks.Kani.Array3;

public class MaxMirror {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 8, 9, 3, 2, 1};
        int[] nums2 = {1, 2, 1, 4};
        int[] nums3 = {7, 1, 2, 9, 7, 2, 1};

        System.out.println("maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → " + maxMirror(nums1));
        System.out.println("maxMirror([1, 2, 1, 4]) → " + maxMirror(nums2));
        System.out.println("maxMirror([7, 1, 2, 9, 7, 2, 1]) → " + maxMirror(nums3));
    }

    /*
    Мы будем говорить, что «зеркальный» раздел массива — это группа смежных элементов, причем где-то в массиве одна и та же группа появляется в обратном порядке. Например, самая большая секция зеркала в {1, 2, 3, 8, 9, 3, 2, 1} имеет длину 3 (часть {1, 2, 3}).
    Возвращает размер наибольшего зеркального раздела, найденного в данном массиве.
     */
    public static int maxMirror(int[] nums) {
        int len = nums.length;
        int count = 0;
        int max = 0;

        for (int i = 0; i < len; i++) {
            count = 0;
            for (int j = len - 1; i + count < len && j > -1; j--) {
                if (nums[i + count] == nums[j]) {
                    count++;
                } else {
                    if (count > 0) {
                        max = Math.max(count, max);
                        count = 0;
                    }
                }
            }
            max = Math.max(count, max);
        }
        return max;
    }
}
