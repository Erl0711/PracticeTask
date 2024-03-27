package org.practice.tasks.zhyldyz.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
    //Given a list of strings, return a list where each string has "y" added at its start and end.
    public static List<String> moreY(List<String> strings) {
        strings = strings.stream()
                .map(n -> "y" + n + "y")
                .collect(Collectors.toList());
        return strings;
    }
}
