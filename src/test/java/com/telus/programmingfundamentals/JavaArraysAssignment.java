package com.telus.programmingfundamentals;

import java.util.Arrays;

public class JavaArraysAssignment {

    public static void main(String[] args) {

        // Create Arrays and Allocate Memory
        System.out.println("***********First way to Create Arrays***************");
        int arr[] = new int[5];
        //Assign the values
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //Accessing the Array Values
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        // By Loop
        for (int num : arr) {
            System.out.println(num);
        }

        System.out.println("***********Second way to Create Arrays***************");

        String arrName[] = {"Ram", "Kapil", "Hari", "Jai"};

        // Accessing the Array Values By For Loop

        for (int i = 0; i < arrName.length; i++) {

            System.out.println(arrName[i]);
        }

        // print as list using tostring method

        String list = Arrays.toString(arrName);

        System.out.println(list);


        String arrNames[] = {"Naresh", "Kapil", "Harsh", "Puneet"};
        System.out.println(arrNames[3]);

        // Display
        for (String iArr : arrNames) {
            System.out.println(iArr);
        }

        String arrNumList2 = Arrays.toString(arrNames);
        System.out.println(arrNumList2);

        System.out.println("********************Methods***********************");

        // Present or not
        boolean word = Arrays.asList(arrNames).contains("Kapil");
        System.out.println(word);

        // split() method : Split with space
        String msg = "Welcome to Java";

        String arrWords[] = msg.split(" ");
        for (String iArr : arrWords) {
            System.out.println(iArr);
        }

    }
}
