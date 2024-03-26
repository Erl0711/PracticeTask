package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {
    //Given a list of integers, return a list of the integers, omitting any that are less than 0.
    public static List<Integer> noNeg(List<Integer> nums){
        return  nums.stream()
                .filter(n -> n >=0)
                .collect(Collectors.toList());
    }
    //Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
    public static List<Integer> no9(List<Integer> nums){
        return nums.stream()
                .filter(n -> n %10!= 9)
                .collect(Collectors.toList());
    }
    //Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
    public static List<Integer> noTeen(List<Integer> nums){
        return nums.stream()
                .filter(n -> n <=13||n >=19)
                .collect(Collectors.toList());
    }
}
