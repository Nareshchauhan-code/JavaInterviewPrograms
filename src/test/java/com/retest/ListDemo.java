package com.retest;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList();
        list.add(123);
        list.add("Naresh");
        list.add(true);
        list.add(1233.444);
        list.add('C');

        System.out.println(list);

        Set<String> languages = new HashSet<>();
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        System.out.println("Set: " + languages);

        // Using forEach loop
        System.out.println("Iterating over Set using for-each loop:");
        for(String language : languages) {
            System.out.print(language);
            System.out.print(", ");
        }

    }
}
