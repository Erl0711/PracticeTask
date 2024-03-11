package org.practice.tasks.Gulaiym.Map2;

import java.util.HashMap;
import java.util.Map;

/*  Учитывая массив строк, верните Map<String, Integer>,
        содержащий ключ для каждой строки в массиве,
        всегда со значением 0. Например, строка «hello» создает пару «hello»:0.
        Позже мы проделаем более сложный подсчет, но в этой задаче значение просто равно 0.
        word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
        word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
        word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}*/
public class word0 {
    public static void main(String[] args) {
                  String[] words= {"a", "b", "a", "c", "b"};
                  Map<String, Integer> result = word0(words);
                  System.out.println(result);
              }
              public static Map<String, Integer> word0(String[] words) {
              Map<String, Integer> resultMap = new HashMap<>();
              for (String word : words) {
                  resultMap.put(word, 0);
                  }
                  return resultMap;
              }
          }



