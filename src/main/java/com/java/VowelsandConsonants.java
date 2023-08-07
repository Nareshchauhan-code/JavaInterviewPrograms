package com.java;

public class VowelsandConsonants {

    public static void main(String[] args) {

        char arr[] = {'a', 'f', 'g', 'e'};

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
                System.out.println("This is Vowel :" + arr[i]);

            } else {
                System.out.println("Tis is consonant : " + arr[i]);
            }
        }

    }

}
