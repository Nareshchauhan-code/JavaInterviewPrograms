package com.inverview.question;

import java.util.ArrayList;
import java.util.List;

public class RemovetheValue {

    void removetheValue(int... num) {


        int afteRemove = 0;

        for (int i = 0; i < num.length; i++) {

            if (num[i] == 3) {
                System.out.println("3 is Present ");
                break;
            }
            afteRemove = afteRemove + num[i];

        }
        System.out.println(afteRemove);
    }

    public static void main(String[] args) {

        RemovetheValue ob = new RemovetheValue();
        ob.removetheValue(123456);

    }
}
