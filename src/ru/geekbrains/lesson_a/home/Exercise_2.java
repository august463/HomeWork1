package ru.geekbrains.lesson_a.home;

public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println(task10and20 (5, 8));
    }
    public static boolean task10and20(int x, int y) {
        System.out.println();
        int sum = x + y;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }


}

