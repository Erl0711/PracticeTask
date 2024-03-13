package org.practice.tasks.UlanT.Codingbat;

import java.util.Arrays;
import java.util.List;

public class Functional1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = square(numbers); // Сохраняем измененный список
        System.out.println(squaredNumbers);

    }
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll (n -> n * n);
        return nums;
    }
}
