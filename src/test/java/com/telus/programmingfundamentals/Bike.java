package com.telus.programmingfundamentals;

//Creating a parent class.
class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

// Child Class extends Parent Class Vehicle
public class Bike extends Vehicle {

    //defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Bike bike = new Bike();//creating object
        bike.run();//calling method
    }
}

