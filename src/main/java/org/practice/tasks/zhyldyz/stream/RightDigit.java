package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.stream.Collectors;

public class RightDigit {
    //Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
    public static List<Integer> rightDigit(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
        return nums;
    }
}
