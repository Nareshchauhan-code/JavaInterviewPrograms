package com.java;

class SuperDemo3 {


    public SuperDemo3() {

        System.out.println("Parent Constructor");
    }

    public SuperDemo3(int a) {

        System.out.println("Parent param Constructor");
    }

}

class SuperDemo4 extends SuperDemo3 {

    public SuperDemo4() {


        System.out.println("Child Constructor");

    }

    public SuperDemo4(int a) {

        super(a);

        System.out.println("Child param Constructor");
    }
}

public class SuperKeywordwithConstructor {


    public static void main(String[] args) {


        SuperDemo4 obj = new SuperDemo4(10);


    }
}
