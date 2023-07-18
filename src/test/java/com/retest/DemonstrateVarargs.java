package com.retest;

public class DemonstrateVarargs {

    void getNumericData(int... a) {

        int b[] = a;

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

    }

    void getStringData(String... a) {

        String b[] = a;

        for (int i = 0; i < a.length; i++) {
            System.out.println(b[i]);
        }

    }

    public static void main(String[] args) {

        DemonstrateVarargs ob = new DemonstrateVarargs();
        System.out.println("******************Numeric Data***********");
        ob.getNumericData(10, 20, 30, 40, 50);
        System.out.println("************String Data*******************");
        ob.getStringData("Naresh","Anas","Hari","Suraj","Dhanraj","Shafeek");

    }
}
