package com.java;

import java.util.Scanner;

public class StarPattern2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Value : ");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {

            for(int j=0; j<=i; j++){

                System.out.print("*");
            }
            System.out.println(" ");
        }


    }

}
