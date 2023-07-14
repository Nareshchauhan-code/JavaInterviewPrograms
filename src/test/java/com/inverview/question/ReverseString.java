package com.inverview.question;

import java.util.Scanner;

public class ReverseString {

    public void reverseString(String value) {

        String reverseValue = "";

        for (int i = value.length() - 1; i >= 0; i--) {

            char charValue = value.charAt(i);
            reverseValue = reverseValue + charValue;
        }
        System.out.println(reverseValue);
    }

    public void reverseString2(String value) {

       StringBuffer stringBuffer = new StringBuffer(value);
        System.out.println(stringBuffer.reverse());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String : ");
        String value = sc.nextLine();

        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(value);
        reverseString.reverseString2("Sonu");


    }
}
