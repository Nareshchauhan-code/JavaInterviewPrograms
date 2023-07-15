package com.inverview.question;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesElementsavaArrayByHashSet {

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

        // Using Hashset

        Set<String> name = new HashSet<String>();

        for (String val : arr) {
            if (name.add(val) == false) {

                System.out.println("This is Duplicate Value : " + val);
            }
        }


    }


}
