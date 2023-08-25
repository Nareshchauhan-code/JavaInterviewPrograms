package javaprogramming;

import java.util.Scanner;

public class FindDigitFromString {

    public void checkDigit(String value) {

        String digit = "";
        String charValue = "";

        for (int i = 0; i < value.length(); i++) {

            char ch = value.charAt(i);

            if (Character.isDigit(ch)) {

                digit = digit + ch;
            }
            if (!Character.isDigit(ch)) {
                charValue = charValue + ch;
            }
        }

        System.out.println("Digit Values : " + digit);
        System.out.println("Char Values : " + charValue);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Value");
        String value = sc.next();

        StringDigit2 stringDigit = new StringDigit2();
        stringDigit.checkDigit(value);


    }

}
