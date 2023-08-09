package com.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");

        int num = sc.nextInt();

        int count = 0;

        if (num > 1) {

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("This is Prime number :" + num);
            } else {
                System.out.println("This is not prime number :" + num);
            }

        } else {

            System.out.println("This is not prime number : " + num);
        }

    }
}
