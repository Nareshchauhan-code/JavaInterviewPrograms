package com.retest;

public class VarargsDemo {

    VarargsDemo(int... a) {

        int[] arr = a;

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        VarargsDemo ob = new VarargsDemo(10, 20, 30, 40, 10, 30, 50);

    }
}
