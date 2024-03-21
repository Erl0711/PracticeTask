package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {
    //Given a list of integers, return a list where each integer is multiplied by 2.
    public List<Integer> doubling(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        return nums;
    }
}
