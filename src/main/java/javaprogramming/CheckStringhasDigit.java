package javaprogramming;

import java.util.Scanner;

public class CheckStringhasDigit{

    public void checkDigit(String value) {

        boolean status = false;

        for (int i = 0; i < value.length(); i++) {

            char ch = value.charAt(i);

            if (Character.isDigit(ch)) {

                status = true;
            } else {

                status = false;
            }
        }

        System.out.println("The status is : " + status);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Value");
        String value = sc.next();

        CheckStringhasDigit stringDigit = new CheckStringhasDigit();
        stringDigit.checkDigit(value);


    }

}
