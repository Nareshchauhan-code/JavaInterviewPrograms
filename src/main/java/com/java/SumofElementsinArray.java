package com.java;

public class SumofElementsinArray {

    public static void main(String[] args) {

        int arr[] = {20, 30, 40, 50, 60};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
