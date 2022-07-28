package com.EPAMjavaWEB.task2.task201;
// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов

import java.util.Random;

public class PerimetrAndSquare {
    public static void main(String[] args) {
        int a, b;
        double p, s;
        Random trigonSide = new Random();
        a = trigonSide.nextInt(50, 75);
        b = trigonSide.nextInt(25, 50);
        p = a + b + Math.sqrt(a * a + b * b);
        s = a * b;
        s = s / 2;
        System.out.printf("Задан прямоугольный треугольник со сторонами a=%d  и  b=%d\n", a, b);
        System.out.printf("Периметр прямоугольного треугольника равен %4.2f\n", p);
        System.out.printf("Площадь прямоугольного треугольника равена %4.2f\n", s);
    }
}
