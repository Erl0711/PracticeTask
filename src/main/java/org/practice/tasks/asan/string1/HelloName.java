package org.practice.tasks.AsanC.string1;

public class HelloName {
    public static void main(String[] args) {
        /*
        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
        */
        System.out.println(helloName("Asan"));
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
