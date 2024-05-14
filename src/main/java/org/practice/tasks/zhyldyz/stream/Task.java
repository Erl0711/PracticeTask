package org.practice.tasks.zhyldyz.stream;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 20);

        Map<String, Integer> sortedMap = sortKey(map); // Сортировка сначала по имени
        System.out.println("Сортировка по ключам");
        for (String key : sortedMap.keySet()) {
            System.out.println(key + ": " + sortedMap.get(key));
        }

        Map<String, Integer> sortedMap2 = sortValue(map); // Сортировка по возрасту
        System.out.println("Сортировка по значениям");
        for (String key : sortedMap2.keySet()) {
            System.out.println(key + ": " + sortedMap2.get(key));
        }
    }

    public static Map<String, Integer> sortKey(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // Сортировка по имени (по алфавиту)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }

    public static Map<String, Integer> sortValue(Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) // Сортировка по возрасту
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }
}