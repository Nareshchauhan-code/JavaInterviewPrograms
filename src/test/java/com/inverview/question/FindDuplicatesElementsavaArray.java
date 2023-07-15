package com.inverview.question;

public class FindDuplicatesElementsavaArray {

    public static void main(String[] args) {

        String arr[] = new String[8];
        arr[0] = "Java";
        arr[1] = "Selenium";
        arr[2] = "Selenium";
        arr[3] = "Java";
        arr[4] = "C";
        arr[5] = "Python";
        arr[6] = "C";
        arr[7] = "Golang";

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {

                    System.out.println("Duplicate value is : " + arr[i]);

                }

            }

        }

    }
}
