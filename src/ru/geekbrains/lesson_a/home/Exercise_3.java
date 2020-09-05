package ru.geekbrains.lesson_a.home;

public class Exercise_3 {
    public static void main(String[] args) {
        isPositiveOrNegative(-5);
    }
    public static void isPositiveOrNegative(int x) {
        if(x >= 0) System.out.println("Число " + x + " положительное");
        else System.out.println("Число " + x + " отрицательное");
    }


}
