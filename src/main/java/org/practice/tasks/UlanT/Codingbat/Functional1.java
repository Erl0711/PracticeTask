package org.practice.tasks.UlanT.Codingbat;

import java.util.Arrays;
import java.util.List;

public class Functional1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = square(numbers);
        System.out.println(squaredNumbers);

        List<String> star = Arrays.asList("a", "bb", "ccc");
        List<String> starNums = addStar(star);
        System.out.println(starNums);

    }
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll (n -> n * n);
        return nums;
    }
    public static List<String> addStar(List<String> strings) {
        strings.replaceAll (n -> n + "*");
        return strings;
    }
    public List<String> copies3(List<String> strings) {
        strings.replaceAll (n -> n +  n + n);
        return strings;
    }
}
