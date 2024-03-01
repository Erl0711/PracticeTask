package org.PracticeTasks.UlanT.Codingbat;

import java.util.HashMap;
import java.util.Map;

public class mapBully {
    public static void main(String[] args) {

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("a", "candy");
        inputMap.put("b", "dirt");
        System.out.println(mapBully(inputMap));


    }
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a","");
        }
        return map;
    }

}
