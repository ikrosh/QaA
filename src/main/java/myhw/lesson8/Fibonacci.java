package myhw.lesson8;

import java.util.ArrayList;

public class Fibonacci {

// 4.Fibonacci (Рассчитать первых 50 чисел Фиббоначии вывести их на экран)

    public static void fibonacciMethod() {

        int number = 50;

        ArrayList<Long> fib = new ArrayList<>();
        fib.add(0, Long.valueOf(0));
        fib.add(0, Long.valueOf(1));

        for (int i = 2; i < 50; i++ ) {
           fib.add(i, fib.get(i-2) + fib.get(i-1));
        }

        for (Long i:fib) System.out.println(i);
    }
}
