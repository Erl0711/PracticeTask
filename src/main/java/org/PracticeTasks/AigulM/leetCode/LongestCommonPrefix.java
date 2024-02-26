package org.PracticeTasks.AigulM.leetCode;


public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        String str = strs[0];

// находим самое короткое слово из массива
        for(int i = 0; i < strs.length; i++){
            if(str.length() > strs[i].length()){
                str = strs[i];
            }
        }
// сравниваем каждую первую букву каждого слова из массива с первой буквой выбранного короткого слова
        for(int i = 0; i < str.length(); i++){
            int count = 0;
            for (int j = 0; j < strs.length; j++){
                if(str.substring(i,i+1).equals(strs[j].substring(i,i+1))){
                    count++;
                }
            }
            if(strs.length == count){
                prefix += str.substring(i,i+1);
            }
            else {
                return prefix;
            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        String[] strs = {"sead", "sea", "sear"};
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(strs));
    }
}
//    Write a function to find the longest common prefix string amongst an array of strings.
//    If there is no common prefix, return an empty string "".
//
//    Example 1:
//    Input: strs = ["flower","flow","flight"]
//    Output: "fl"
//
//    Example 2:
//    Input: strs = ["dog","racecar","car"]
//    Output: ""
//    Explanation: There is no common prefix among the input strings.
//
// Constraints:
//
//  1 <= strs.length <= 200
//  0 <= strs[i].length <= 200
//    strs[i] consists of only lowercase English letters.
