package org.practice.tasks.Gulaiym.Tex_Zadachi;

import java.util.Arrays;

public class ArrayReverse {
    /*принимает массив в качестве аргумента и разворачивает его*/
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        /*[1,2,3,4,5]*/
        System.out.println(Arrays.toString(myArray));
        reverseArray(myArray);
        /*[5,4,3,2,1]*/
        System.out.println(Arrays.toString(myArray));
    }
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            /* Обмен значение между начальным и конечным индексом */
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            /* Переход к следующим элементом */
            start++;
            end--;
        }
    }
}
