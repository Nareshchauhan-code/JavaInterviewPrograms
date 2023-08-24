package com.JavaInterviewQuestions;

import java.util.Scanner;

public class Armstrong {

    public void armstrong(int num) {

        int temp = num;
        int cube = 0;
        int r;

        while (num > 0) {

            r = num % 10;
            num = num / 10;
            cube = cube + (r * r * r);
        }

        if (temp == cube) {
            System.out.println("This is Armstrong Number : " + temp);
        } else {

            System.out.println("This is not Armstrong Number : " + temp);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int num = sc.nextInt();

        Armstrong ob = new Armstrong();
        ob.armstrong(num);

    }
}
