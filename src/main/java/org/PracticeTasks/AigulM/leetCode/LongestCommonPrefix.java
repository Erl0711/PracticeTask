package org.PracticeTasks.AigulM.leetCode;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String str = strs[0];

// находим самое короткое слово из массива
        for (int i = 0; i < strs.length; i++) {
            if (str.length() > strs[i].length()) {
                str = strs[i];
            }
        }
// сравниваем каждую первую букву каждого слова из массива с первой буквой выбранного короткого слова
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < strs.length; j++) {
                if (str.substring(i, i + 1).equals(strs[j].substring(i, i + 1))) {
                    count++;
                }
            }
            if (strs.length == count) {
                prefix += str.substring(i, i + 1);
            } else {
                return prefix;
            }
        }
        return prefix;
    }
}