package com.EPAMjavaWEB.task2.task202;
//Три сопротивления R1, R2, и R3 соединены параллельно. Найдите сопротивление соединения

public class Resistance {
    public static int resistanceR1R2R3() {
        return (int) (Math.random() * 77);
    }

    public static void main(String[] args) {
        int r1, r2, r3;
        double res;
        r1 = resistanceR1R2R3();
        r2 = resistanceR1R2R3();
        r3 = resistanceR1R2R3();
        res = r1 * r2 * r3;
        res = res / (r1 * r2 + r2 * r3 + r1 * r3);
        System.out.printf("Сопротивление параллельной цепи R1=%d, R2=%d, R3=%d равно  %4.2f\n", r1, r2, r3, res);
    }
}
