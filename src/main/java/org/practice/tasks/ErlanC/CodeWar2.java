package org.practice.tasks.ErlanC;

import java.util.Arrays;

public class CodeWar2 {
    public static void main(String[] args) {
        Boolean [] arr = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, null,  false,
                true,  false, false, true ,
                true,  true,  null,  true ,
                false, false, true,  true};

        System.out.println(countSheeps(arr));
    }

    /* Рассмотрим массив / список овец, в котором некоторые овцы могут отсутствовать на своем месте.
    Нам нужна функция, которая подсчитывает количество овец, присутствующих в массиве (true означает "присутствует").
     */

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(s -> s != null).filter(s -> s).count();
    }
}
