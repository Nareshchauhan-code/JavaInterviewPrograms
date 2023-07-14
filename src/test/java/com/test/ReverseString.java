package com.test;

public class ReverseString {

    public static void main(String[] args) {


        String name = "Naresh Chauhan";

        String reverseValue = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            char value = name.charAt(i);

            reverseValue = reverseValue + value;

        }
        System.out.println(reverseValue);
    }
}
