package com.java;

public class VarargsDemo {

    public void addData(int... value) {

        for (int i = 0; i < value.length; i++) {

            System.out.println(value[i]);
        }


    }

    public static void main(String[] args) {

        VarargsDemo ls = new VarargsDemo();
        ls.addData(10, 20, 40, 50);

    }
}
