package com.inverview.question;

public class palindromeString {
    public static void main(String[] args) {

        String name = "level";

        String reverseName = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            char value = name.charAt(i);


            reverseName = reverseName + value;
        }

        if (reverseName.equalsIgnoreCase(name)) {

            System.out.println("This is palindrome String : " + reverseName);
        } else {
            System.out.println("This is not palindrome String : " + reverseName);
        }
    }
}
