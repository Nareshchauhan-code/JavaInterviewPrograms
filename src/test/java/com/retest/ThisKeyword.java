package com.retest;

public class ThisKeyword {

    String name = "Naresh";

    ThisKeyword(String name) {

        this.name = name;
        System.out.println("Well come");
    }

    public static void main(String[] args) {

        ThisKeyword ob = new ThisKeyword("Kapil");
        String name = ob.name;
        System.out.println(name);

    }
}
