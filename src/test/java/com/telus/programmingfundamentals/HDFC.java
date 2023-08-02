package com.telus.programmingfundamentals;
// Child Class - Method Overriding 
public class HDFC extends RBI {	
	
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan Interest = "+ interest);
		System.out.println("HDFC Class(Child) is executed");
		return interest;
	}

	public static void main(String[] args) {		
		HDFC obj = new HDFC();
		obj.getHomeLoan(7.10f);

	}

}
