package org.practice.tasks.zhyldyz.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SimpleMap {
    public static Map<Integer, Integer> sortValue(Map<Integer, Integer> map) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0) //фильтр
                .collect(Collectors.toMap(Map.Entry::getKey, HashMap.Entry::getValue)); // Собрать результат обратно в Map
    }

    public static Map<Integer, Integer> sortKey(Map<Integer, Integer> map) {
        return map.entrySet().stream()
                .filter(entry -> entry.getKey() > 0) //фильтр
                .collect(Collectors.toMap(Map.Entry::getKey, HashMap.Entry::getValue)); // Собрать результат обратно в Map
    }

    public static Map<Integer, Integer> filterValue(Map<Integer, Integer> map) {
        return map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // сортировка по ключам
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, HashMap::new)); // сборка
    }
}
