package org.practice.tasks.zhyldyz.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaseStream {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "bb", "ccc");
        List<String> result = Copies3.copies3(input);
        System.out.println(result);

        List<String> result2= MoreY.moreY(input);
        System.out.println(result2);

        List<Integer> nums= Arrays.asList(1,4,6,7);
        List<Integer> result3= Math1.math1(nums);
        System.out.println(result3);

        List<Integer> nums2 = Arrays.asList(1,29,33,43);
        List<Integer> result4= RightDigit.rightDigit(nums2);
        System.out.println(result4);

        List<String> list = Arrays.asList("Heloo", "HYuj");
        List<String> result5= Lower.lower(list);
        System.out.println(result5);
    }
}
