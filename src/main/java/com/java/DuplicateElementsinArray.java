package com.java;

public class DuplicateElementsinArray {
    public static void main(String[] args) {

        String arr[] = {"Java", "C", "C++", "Python", "Java", "Java"};

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equalsIgnoreCase(arr[j])) {

                    count++;
                    System.out.println("Duplicate Value is : " + arr[i]+" and count is "+count);
                }

            }
        }

    }
}
