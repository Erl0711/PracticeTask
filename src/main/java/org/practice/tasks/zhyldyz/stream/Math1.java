package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {
    //Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
    public static List<Integer> math1(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> (n + 1) * 10)
                .collect(Collectors.toList());
        return nums;
    }
}
