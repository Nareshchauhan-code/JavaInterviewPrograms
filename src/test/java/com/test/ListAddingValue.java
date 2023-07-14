package com.test;

import java.util.ArrayList;
import java.util.List;

public class ListAddingValue {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();

        list.add(10);
        list.add(30000);
        list.add(2000000);
        list.add(10);
        list.add(10);

        for (int i = 0; i < list.size(); i++) {

            list1.add(list.get(i));
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }


        System.out.println(list1);

    }
}
