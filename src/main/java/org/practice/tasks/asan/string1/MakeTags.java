package org.practice.tasks.asan.string1;

public class MakeTags {
    public static void main(String[] args) {
        /*
        The web is built with HTML strings like "<i>Yay</i>"
        which draws Yay as italic text. In this example,
        the "i" tag makes <i> and </i> which surround the word "Yay".
         Given tag and word strings, create the HTML string
         with tags around the word, e.g. "<i>Yay</i>".
         */
        System.out.println(makeTags("i", "Yay"));
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
