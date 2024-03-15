package org.practice.tasks.Kani.Map1;

import java.util.HashMap;
import java.util.Map;

public class MapBully {
    public static void main(String[] args) {

        Map<String, String> example1 = new HashMap<>();
        example1.put("a", "candy");
        example1.put("b", "dirt");

        Map<String, String> example2 = new HashMap<>();
        example2.put("a", "candy");

        Map<String, String> example3 = new HashMap<>();
        example3.put("a", "candy");
        example3.put("b", "carrot");
        example3.put("c", "meh");

        System.out.println("Пример 1: " + mapBully(example1));
        System.out.println("Пример 2: " + mapBully(example2));
        System.out.println("Пример 3: " + mapBully(example3));
    }

    /*
    Измените и верните данную карту следующим образом: если ключ «a» имеет значение,
    установите для ключа «b» это значение и установите для ключа «a» значение «».
    По сути, «b» — это хулиган, берущий значение и заменяющий его пустой строкой.
     */
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
