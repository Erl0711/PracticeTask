package org.practice.tasks.UlanT.Codingbat;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();
        for (String s : strings) {
            String key = s.charAt(0) + "";
            if (map.containsKey(key)) {
                String value = map.get(key) + s;
                map.put(key, value);
            } else
                map.put(key, s);
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap();
        String string = "";

        for (String s : strings) {
            String key = s;

            if (map.containsKey(key)) {
                int value = map.get(key);
                value++;
                if (value % 2 == 0)
                    string += key;
                map.put(key, value);
            } else
                map.put(key, 1);
        }
        return string;
    }
}
