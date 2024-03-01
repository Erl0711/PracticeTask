package org.PracticeTasks.UlanT.Codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "candy");
        inputMap.put("b", "dirt");
        inputMap.put("c", "ggg");
        System.out.println(mapShare(inputMap));

        Map<String, String> inputMap2 = new HashMap<>();
        inputMap2.put("a", "Hi");
        inputMap2.put("b", "There");
        inputMap2.put("c", "nope");
        System.out.println(mapAB(inputMap2));
    }

    public static Map<String, String> mapShare(Map<String, String> map) {

        if (map.containsKey("a")) {
            map.put("b", map.get("a"));

        }
        map.remove("c");
        return map;
    }
    public static Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String valueA = map.get("a");
            String valueB = map.get("b");
            map.put("ab", valueA + valueB);
        }
        return map;
    }
}
