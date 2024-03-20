package org.practice.tasks.Kani.Functional1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("a", "bb", "ccc");
        List<String> strings2 = Arrays.asList("hello", "there");
        List<String> strings3 = Arrays.asList("*");

        List<String> result1 = addStar(strings1);
        List<String> result2 = addStar(strings2);
        List<String> result3 = addStar(strings3);

        System.out.println(result1);  // ["a*", "bb*", "ccc*"]
        System.out.println(result2);  // ["hello*", "there*"]
        System.out.println(result3);  // ["**"]
    }

    /*
    Учитывая список строк, верните список, в котором к каждой строке добавлен знак «*» в конце.
     */

    public static List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }
}
