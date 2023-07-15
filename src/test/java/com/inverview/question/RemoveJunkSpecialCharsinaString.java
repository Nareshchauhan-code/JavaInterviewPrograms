package com.inverview.question;

public class RemoveJunkSpecialCharsinaString {

    public static void main(String[] args) {

        String value = "dagshdth&%$(*&*(^#)@@1234";

        // Using Regular Expression

        String afterRemoving = value.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(afterRemoving);

        String value1 = "Selenium@$*$*$($Java";


        String afterRemoving1 = value1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(afterRemoving1);



        
    }
}
