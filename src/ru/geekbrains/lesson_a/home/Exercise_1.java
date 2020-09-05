package ru.geekbrains.lesson_a.home;

public class Exercise_1 {

    public static void main(String[] args) {

        System.out.print(sum(10,4,18,8));
        System.out.println(task10and20 (5, 8));
        isPositiveOrNegative(-5);
        userName("Александр");
        annum(2020);

    }
    /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода
     */

    public static double sum(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
    /*
    Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false
     */

    public static boolean task10and20(int x, int y) {
        System.out.println();
        int sum = x + y;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    /*
    Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    считаем положительным числом
     */
    public static void isPositiveOrNegative(int x) {
        if(x >= 0) System.out.println("Число " + x + " положительное");
        else System.out.println("Число " + x + " отрицательное");
    }
    /*
    Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»
     */
    public static void userName(String name) {
        System.out.println("Привет, " + name + "!");
    }
    /*
    Написать метод, который определяет является ли год високосным, и выводит сообщение
    в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й
    – високосный
     */
    public static void annum(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
        else System.out.println(year + " г. високосный");
    }

}
