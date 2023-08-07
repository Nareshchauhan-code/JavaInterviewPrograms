package com.telus.programmingfundamentals;

import java.util.Scanner;

public class ExceptionHandlingAssignment {

    public static void main(String[] args) {

        // 1. Arithmetic Exception
        int a = 10;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error message is " + e);
        }

        // 2. Null Pointer Exception

        String name = null;
        try {
            if (name.equals("Java")) {
                System.out.println("Strings are same");
            } else {
                System.out.println("String are not same");
            }
        } catch (NullPointerException e) {
            System.out.println("The error message is " + e);
        }

        // 3. Array Index out of bounds exception

        int[] num = new int[4];
        try {
            num[5] = 200;
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The Error message is " + e);
        }

        // 4. Number Format Exception

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Two Values");
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        try {
            int c = Integer.parseInt(s1);
            int d = Integer.parseInt(s2);
            System.out.println("The Addition of Values is :" + (c + d));
        } catch (NumberFormatException e) {
            System.out.println(e);
        }

        // try catch finally Concept using DB example

        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error message is " + e);
        } finally {
            // This code will be executed as compulsory
            System.out.println("Finally Block is executed");
        }

        // The Java throw keyword is used to throw an exception explicitly.

        int age = 16;

        if(age<18)  {
            throw new ArithmeticException("Not valid age to Vote");
        }
        else
        {
            System.out.println("Valid age to Vote !! ");
        }

    }
}
