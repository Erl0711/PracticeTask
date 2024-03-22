package org.practice.tasks.dastan;

public class PrintInBox {

    /**
     * Написать функцию, которая пишет текст в центре прямоугольной рамки (из символов #)
     * // В качестве входных параметров - выводимый текст, высота и ширина прямоугольной рамки
     * //
     * // Пример вывода:
     * //
     * //   printInBox("Hello, World!", 17, 5)
     * //   #################
     * //   #               #
     * //   # Hello, World! #
     * //   #               #
     * //   #################
     */

    public static void printInBox(String text, int width, int height) {
        if (width < text.length() + 2 || height < 3) {
            System.out.println("Ошибка");
            return;
        }

        for (int i = 0; i < width; i++)
            System.out.print("#");
        System.out.println();

        int remainingHeight = height - 2;
        for (int i = 0; i < remainingHeight; i++) {
            if (i == remainingHeight / 2) {
                System.out.println("#" + text + "#");
            } else {
                System.out.println("#" + " ".repeat(width - 2) + "#");
            }
        }

        for (int i = 0; i < width; i++)
            System.out.print("#");
        System.out.println();
    }
}
