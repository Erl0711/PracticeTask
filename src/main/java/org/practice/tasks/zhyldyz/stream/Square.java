package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Square {
    //Given a list of integers, return a list where each integer is multiplied with itself.
    public List<Integer> square(List<Integer> nums) {
        nums = nums.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        return nums;
    }
}
