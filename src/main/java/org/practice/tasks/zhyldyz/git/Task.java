package org.practice.tasks.zhyldyz.git;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task {
    //
    //вот моя задача: найти дубликаты в каждом массиве и вдвух массивах
    //
    //
    //
    //
    public static void main(String[] args) {
        int [] names = {1, 2, 3, 4, 5, 5, 3, 3};

        Map<Integer, Integer> dubl = new HashMap<>();

        Arrays.stream(names).forEach(s -> dubl.put(s, dubl.getOrDefault(s, 0) + 1));

        for (Map.Entry<Integer,Integer> val: dubl.entrySet()){
            if (val.getValue() > 1) {
                System.out.println(val.getKey() + "=" + val.getValue());
            }
        }
    }

    public static void getDublicateInArr(String[] str, String[] str1) {
        Map<String, Integer> dubl = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if(!dubl.containsKey(str[i])) {
                dubl.put(str[i], 0);
            } else{
                dubl.put(str[i], 1);
            }
            if(!dubl.containsKey(str1[i])) {
                dubl.put(str1[i], 0);
            } else{
                dubl.put(str1[i], 1);
            }
        }
        dubl.entrySet().stream().filter(s -> s.getValue() > 0).map(Map.Entry::getKey).forEach(System.out::println);
    }


}
