package com.java;

public class EvenOdd {

    public static void main(String[] args) {

        int arr[] = {10, 21, 30, 60, 55, 90};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.println("Even Number : " + arr[i]);

            } else {
                System.out.println("Odd Number : " + arr[i]);
            }
        }

    }
}
