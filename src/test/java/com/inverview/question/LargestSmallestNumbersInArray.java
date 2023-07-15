package com.inverview.question;

public class LargestSmallestNumbersInArray {

    public static void main(String[] args) {

        int arr[] = {-20, 45, 677, 231, -5};

        int largestnum = arr[0];

        int smallestnum = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largestnum) {

                largestnum = arr[i];
            } else if (arr[i] < smallestnum) {

                smallestnum = arr[i];
            }

        }

        System.out.println("Values of Given Array is : " + arr.toString());
        System.out.println("The Largest number is : " + largestnum);
        System.out.println("The Smallest number is : " + smallestnum);
    }
}
