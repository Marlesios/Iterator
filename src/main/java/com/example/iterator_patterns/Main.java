package com.example.iterator_patterns;

public class Main {
    public static void main(String[] args) {
        for (int r : new Randoms(30, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
