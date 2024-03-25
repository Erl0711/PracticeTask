package org.practice.tasks.zhyldyz.stream;

import java.util.*;

public class BaseStream {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("a", "bb", "ccc");
        List<String> result = Copies3.copies3(input);
        System.out.println(result);

        List<String> result2 = MoreY.moreY(input);
        System.out.println(result2);

        List<Integer> nums = Arrays.asList(1, 4, 6, 7);
        List<Integer> result3 = Math1.math1(nums);
        System.out.println(result3);

        List<Integer> nums2 = Arrays.asList(1, 29, 33, 43);
        List<Integer> result4 = RightDigit.rightDigit(nums2);
        System.out.println(result4);

        List<String> list = Arrays.asList("Heloo", "HYuj");
        List<String> result5 = Lower.lower(list);
        System.out.println(result5);

        List<Integer> nums3 = Arrays.asList(1, -2, -4, 5);
        List<Integer> result6 = NoNeg.noNeg(nums3);
        System.out.println(result6);

        List<Integer> nums4 = Arrays.asList(1, 29, 34, 59, 14, 18, 20);
        List<Integer> result7 = NoNeg.no9(nums4);
        System.out.println(result7);

        List<Integer> result8 = NoNeg.noTeen(nums4);
        System.out.println(result8);

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 5);
        map.put(2, -4);
        map.put(3, 7);
        map.put(4, -6);
        map.put(-3, 5);
        Map<Integer, Integer> result9 = SimpleMap.sortValue(map);
        Map<Integer, Integer> result10 = SimpleMap.sortKey(map);
        System.out.println(result9);
        System.out.println(result10);

        Map<Integer, Integer> result11 = SimpleMap.filterValue(map);
        System.out.println(result11);

    }
}
