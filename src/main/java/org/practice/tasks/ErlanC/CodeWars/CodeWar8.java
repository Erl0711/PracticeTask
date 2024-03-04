package org.practice.tasks.ErlanC.CodeWars;

public class CodeWar8 {

    /*
    Согласно мифам о сотворении мира авраамических религий, Адам и Ева были первыми людьми, которые бродили по Земле.
    Вы должны выполнять работу Бога. Метод creation должен возвращать массив длиной 2,
    содержащий объекты (представляющие Адама и Еву).
    Первый объект в массиве должен быть экземпляром класса Man. Второй должен быть экземпляром класса Woman.
    Оба объекта должны быть подклассами Human. Ваша задача - реализовать классы Human, Man и Woman.
     */
    public static Human[] create() {
        return new Human[]{new Man(), new Woman()};
    }

    public static class Human {

    }

    public static class Man extends Human {

    }

    public static class Woman extends Human {

    }
}
