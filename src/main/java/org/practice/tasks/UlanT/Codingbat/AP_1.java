package org.practice.tasks.UlanT.Codingbat;

import java.util.ArrayList;
import java.util.List;

public class AP_1 {
    public static int wordsCount(String[] words, int len) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public static String[] wordsFront(String[] words, int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = words[i];
        }
        return a;
    }

    public static List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) {
                list.add(words[i]);
            }
        }
        return list;
    }
}