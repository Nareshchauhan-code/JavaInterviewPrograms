package com.retest;

import java.util.Scanner;

public class StudentsGrade {

	public static void main(String[] args) {

		/* Using if else if ladder write java program for students grade.

		Student Marks 	Letter Grade
		80 and above	O
		75 to 79	A
		70 to 74	B
		60 to 69	C
		50 to 59	D
		45 to 49	E
		40 to 44	P
		39 and below	F (Fail)
		*/

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the Student Marks");

		int studentMarks = sc.nextInt();

		if (studentMarks >= 80) {

			System.out.println("Grade is : " + "O");
		}

		else if (studentMarks >= 75 && studentMarks <= 79) {

			System.out.println("Grade is : " + "A");
		}

		else if (studentMarks >= 70 && studentMarks <= 74) {

			System.out.println("Grade is : " + "B");
		}

		else if (studentMarks >= 60 && studentMarks <= 69) {

			System.out.println("Grade is : " + "C");

		} else if (studentMarks >= 50 && studentMarks <= 59) {

			System.out.println("Grade is : " + "D");

		} else if (studentMarks >= 45 && studentMarks <= 49) {

			System.out.println("Grade is : " + "E");

		} else if (studentMarks >= 40 && studentMarks <= 44) {

			System.out.println("Grade is : " + "P");
		}

		else {

			System.out.println("Fail");
		}

		sc.close();

	}

}
