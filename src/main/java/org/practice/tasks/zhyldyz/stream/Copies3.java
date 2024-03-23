package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Copies3 {
    //Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
    public static List<String> copies3(List<String> strings) {
        strings= strings.stream()
                .map (n -> n+n+n)
                .collect(Collectors.toList());
        return strings;
    }

}
