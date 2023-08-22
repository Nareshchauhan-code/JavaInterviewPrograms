package com.JavaInterviewQuestions;

public class CounttheOccurrencesCharacter {

    public void characterCount(String value) {

        int count = 0;

        char[] charr = value.toCharArray();

        for (int i = 0; i < charr.length; i++) {

            for (int j = i + 1; j < charr.length; j++) {

                if (charr[i] == charr[j]) {

                    System.out.println("Duplicate Character is " + charr[i]);
                    count++;
                }
            }

        }

        System.out.println("Count are " + count);
    }

    public static void main(String[] args) {

        CounttheOccurrencesCharacter ob = new CounttheOccurrencesCharacter();
        ob.characterCount("Naresh Chauhan");

    }
}
