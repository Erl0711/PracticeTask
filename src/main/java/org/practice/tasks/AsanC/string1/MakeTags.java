package org.practice.tasks.AsanC.string1;

public class MakeTags {
    public static void main(String[] args) {
        System.out.println(makeTags("i","Yay"));
    }
    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
