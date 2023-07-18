package com.retest;

public class ReverseNumber {

    static void reverseNumber(int number) {

        int reverseNumber = 0;

        while (number > 0) {

            reverseNumber = reverseNumber * 10 + number % 10;

            number = number / 10;

        }
        System.out.println(reverseNumber);
    }

    public static void main(String[] args) {

        reverseNumber(123456);

    }
}
