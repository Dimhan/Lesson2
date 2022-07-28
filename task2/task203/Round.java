package com.EPAMjavaWEB.task2.task203;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class Round {
    public static void main(String[] args) {
        int r = (int) (Math.random() * 100);
        double sRound, lRound;
        sRound = Math.PI * r * r;
        lRound = 2 * Math.PI * r;
        System.out.printf("Площадь круга с радиусом R=%d равна %5.2f\n", r, sRound);
        System.out.printf("Длина окружности с радиусом R=%d равна %5.2f\n", r, lRound);
    }
}
