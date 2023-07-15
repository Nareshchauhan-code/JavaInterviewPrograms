package com.inverview.question;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int arr[] ={1,2,3,4,5,6,7,8,10};

        int add = 0;

        for(int i=0; i<arr.length;i++){

            add = add+arr[i];
        }
        System.out.println("The Addition of all Number is : "+add);


        System.out.println("*********************************************");

        int add2 =0;

        for(int i=0;i<=10;i++){

            add2=add2+i;

        }
        System.out.println("The Addition of all Number is : "+add2);

        System.out.println("The missing number is : "+(add2-add));
    }
}
