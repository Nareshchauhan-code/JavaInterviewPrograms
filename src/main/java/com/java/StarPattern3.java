package com.java;

import java.util.Scanner;

public class StarPattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Value : ");
        int num = sc.nextInt();

       for(int i=1; i<=num; i++){

           for(int j=num; j>=i;j--){

               System.out.print("*");
           }
           System.out.println(" ");
       }

    }

}
