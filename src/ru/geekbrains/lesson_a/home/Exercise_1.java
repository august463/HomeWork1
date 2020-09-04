package ru.geekbrains.lesson_a.home;

public class Exercise_1 {
    public static double sum(int a, int b, int c, int d){
        System.out.println();
        int result = a * (b + (c / d));
        return result;
    }
    public static void main(String[] args) {

        int x = 8;
        int y = 10;
        int z = 12;
        int w = 18;
        System.out.print(sum(x, y, z, w));

    }
}
