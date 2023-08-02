package com.telus.programmingfundamentals;
// Parent Class
public class RBI {
	
	float interest = 6.70f;
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest = "+ interest);
		System.out.println("RBI Class(parent) is executed");
		return interest;
	}
}
