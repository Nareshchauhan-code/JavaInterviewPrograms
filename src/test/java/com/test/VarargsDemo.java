package com.test;

public class VarargsDemo {

    public void addData(int... value) {

        for (int j : value) {

            System.out.println(j);
        }


    }

    public static void main(String[] args) {

        VarargsDemo ls = new VarargsDemo();
        ls.addData(10, 20, 40, 50);

    }
}
