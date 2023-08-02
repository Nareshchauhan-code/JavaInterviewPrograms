package com.logicprogramming;

public class FibonacciSeries {

    public static void main(String[] args) {

        // 0+1=2 next 1+2=3 next 2+3

        int n1 = 0, n2 = 1, sum = 0;
        System.out.print(n1 + " " + n2);

        for (int i = 0; i < 10; i++) {

            sum = n1 + n2;
            System.out.print(" " + sum);

            n1 = n2;
            n2 = sum;
        }

    }
}
