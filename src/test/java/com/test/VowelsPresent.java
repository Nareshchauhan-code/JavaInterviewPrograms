package com.test;

public class VowelsPresent {

    public static boolean checkVowel(String input){

        return input.toLowerCase().matches(".*[aeiou].*");

    }

    public static void main(String[] args) {

        System.out.println(checkVowel("Naresh Chauhan"));

    }

}
