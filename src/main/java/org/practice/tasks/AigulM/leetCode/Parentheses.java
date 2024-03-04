package org.practice.tasks.AigulM.leetCode;

public class Parentheses {

//    public boolean isValid(String s) {
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < s.length()-1; i++) {
//
//            switch (s){
//                case "(":
//                    count1++;
//            }
//
//            if (s.substring(i, i + 1).contains("(")) {
//                count1++;
//            }
//            if (s.substring(i).contains(")")) {
//                    count2++;
//            }
//                    if (count1 == count2) {
//                    }
//
////                return true;
//
//            if (s.charAt(i) == '{') {
//                count1++;
//            }
//            if (s.charAt(i) == '}') {
//                count1++;
//            }
//
//                if (s.substring(i+1).equals("}")) {
//                    count2++;
//                    if (count1 == count2) {
//                    }
//                }
//                return true;
//            }
//            if (s.substring(i, i + 1).contains("[")) {
//                count1++;
//                if (s.substring(i + 1).contains("]")) {
//                    count2++;
//                    if (count1 == count2) {
//                    }
//                }
//                return true;
//            }
//        }
//        return false;
    }
//    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//
//    Example 1:
//    Input: s = "()"
//    Output: true

//    Example 2:
//    Input: s = "()[]{}"
//    Output: true

//    Example 3:
//    Input: s = "(]"
//    Output: false
//
//    Constraints:
//            1 <= s.length <= 104
//    s consists of parentheses only '()[]{}'.

