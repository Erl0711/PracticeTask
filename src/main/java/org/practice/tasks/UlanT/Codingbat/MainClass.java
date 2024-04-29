package org.practice.tasks.UlanT.Codingbat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(AP_1.wordsCount(new String[]{"a", "bb", "ccc", "dd"}, 2));
        System.out.println(Arrays.toString(AP_1.wordsFront(new String[]{"a", "b", "c", "d"}, 3)));
        System.out.println(AP_1.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 2));
        System.out.println(Map2.firstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"}));
        System.out.println(String2.doubleChar("Hello"));
        System.out.println(String2.countHi("abc hi ho hi"));
        System.out.println(String2.catDog("dogogcat"));
        System.out.println(String2.countCode("AAcodeBBcoleCCccoreDD"));
        //recursion
        System.out.println(Recursion1.sumDigits(34));
        System.out.println(Recursion1.bunnyEars(23));
    }
}
