package com.java;

public class MaximumValue {

    public static void main(String[] args) {

        int arr[] = {20, 40, 60, 30};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.println("The Maximum Number is : " + max);
    }
}
