package com.telus.programmingfundamentals;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		// 1. Create Array
		// Syn: dataType arrName[]
		int arrNum[];	

		// 2 . Define Arrays - Allocate Memory
		// Syn : arrName = new dataType[size]
		arrNum = new int[4];

		// 3. Assign the values
		arrNum[0] = 100;
		arrNum[1] = 200;
		arrNum[2] = 300;
		arrNum[3] = 400;

		// Display (accessing)
		System.out.println(arrNum[2]);

		System.out.println("*********************Numbers***********************");

		// Alternative way
		int arrNum2[] = {10,20,30,40,50,60};
		System.out.println(arrNum2[3]);


		// Print all the arrays
		for(int iArr : arrNum2) {
			System.out.println(iArr);
		}

		// print as list using tostring method
		String arrNumList = Arrays.toString(arrNum2);
		System.out.println(arrNumList);

		System.out.println("********************Strings***********************");

		String arrName[] = {"Vinoth","Ram","Anand","Pranav"};
		System.out.println(arrName[3]);

		// Display
		for(String iArr : arrName) {
			System.out.println(iArr);
		}

		String arrNumList2 = Arrays.toString(arrName);
		System.out.println(arrNumList2);

		System.out.println("********************Methods***********************");

		// Present or not
		boolean word = Arrays.asList(arrName).contains("Anand");
		System.out.println(word);

		// String Method
		// split() method
		String msg = "Welcome to NxtGen AI Academy. AI is called Artificical Intellience";

		String arrWords[] = msg.split("AI");
		for(String iArr : arrWords) {
			System.out.println(iArr);
		}

	}

}
