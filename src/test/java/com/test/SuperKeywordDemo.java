package com.test;

class SuperDemo1 {

    int a = 100;

    public void getData() {

        System.out.println("Welcome to Java : " + a);
    }
}

class SuperDemo2 extends SuperDemo1 {

    public void getData() {

        super.getData();
        int a = 200;

        System.out.println("Welcome to Java : " + a);

    }
}

public class SuperKeywordDemo {


    public static void main(String[] args) {


        SuperDemo2 obj = new SuperDemo2();
        obj.getData();

    }
}
