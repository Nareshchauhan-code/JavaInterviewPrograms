package com.java;

public class CheckDigits {
    public static void main(String[] args) {

        String value = "Naresh123";

        int digit =0;

        for (int i = 0; i < value.length(); i++) {

            if (Character.isDigit(value.charAt(i))) {

                digit=digit+value.charAt(i);
            }
        }

        System.out.println(digit);

    }
}
