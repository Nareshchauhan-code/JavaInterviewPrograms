package javaprogramming;

public class UpperCaseCount2 {

    public static void upperCaseCount(String value) {

        int uppercaseCount = 0;
        int lowercaseCount = 0;

        for (int i = 0; i < value.length(); i++) {

            char ch = value.charAt(i);
            if (Character.isUpperCase(ch)) {

                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {

                lowercaseCount++;
            }
        }
        System.out.println("Uppercase count is : " + uppercaseCount);
        System.out.println("Lowercase Count is : " + lowercaseCount);
    }

    public static void main(String[] args) {

        upperCaseCount("My name is Naresh");
    }

}
