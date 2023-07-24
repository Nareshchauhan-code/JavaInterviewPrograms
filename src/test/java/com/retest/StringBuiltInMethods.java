package com.retest;

public class StringBuiltInMethods {

	public static void main(String[] args) {

		String msg = "Welcome To Java Class";

		// 1. length()

		System.out.println("Length of String is : "+msg.length());

		// 2. toLowerCase()

		System.out.println("Lower Case String Method : "+msg.toLowerCase());

		// 3. toUpperCase()

		System.out.println("Upper Case String Method : "+msg.toUpperCase());

		// 4. trim()

		String emailID = " nareshchauhan2014@gmail.com ";

		// Before trim
		System.out.println("Before Trim Method : "+emailID);

		// After trim
		System.out.println("After Trim Method : "+emailID.trim());

		// 5. concat()

		String firstName = "Naresh ";
		String secondName = "Kumar ";
		String lastName = "Chauhan ";

		// By using +

		System.out.println("Concat String by + Operator : "+firstName + secondName + lastName);

		// By Using concat() method

		System.out.println("Concat String by Concat Method : "+firstName.concat(secondName).concat(lastName));

		// String Comparing

		// 6. equals()

		String value2 = "a";
		String value3 = "A";
		// By Using ==

		System.out.println("Comparing String by == Operator : "+value2 == value3);

		// By Using equals
		System.out.println("Comparing String by Equals Method : "+value2.equals(value3));

		// By Using EqualsIgnoreCase
		System.out.println("Comparing String by EqualsIgnoreCase Method : "+value2.equalsIgnoreCase(value3));

		// Three-way comparison

		// 7. compareTo()
		/*
		 * String 1= String 2 -> Zero 
		 * String 1> String 2 -> +ve value 
		 * String 1<String 2 -> -ve value
		 * 
		 * 
		 */

		String value4 = "a";
		String value5 = "A";

		System.out.println("Comparing String by compareTo() Method : "+value4.compareTo(value5));
		System.out.println("Comparing String by compareTo() Method : "+value5.compareTo(value4));
		System.out.println("Comparing String by compareToIgnoreCase() Method : "+value4.compareToIgnoreCase(value5));

		// 8. charAt()

		String courseID = "Automation";

		System.out.println("Find the Char by Index charAt() Method : "+courseID.charAt(5));

		// 9. indexOf()

		System.out.println("Find the index by indexOf() Method : "+courseID.indexOf('o'));

		// 10. contains()

		System.out.println("String contains() Method : "+courseID.contains("A"));

		// 11. substring()

		String name = "Naresh Kumar Chauhan";

		String getMiddleName = name.substring(7, 12);

		System.out.println("String substring() Method : "+getMiddleName);

		// 12. replace()

		String name1 = "Naresh Kumar Chauhan";

		System.out.println("String replace() Method : "+name1.replace('K', 'J'));

		// 13 split()

		String name3 = "Naresh Kumar Chauhan";

		String[] splitValue = name3.split(" ");

		//Iterate Through for each loop

		for(String value:splitValue){

			System.out.println("String split() Method : "+value);
		}


	}

}
