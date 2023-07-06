package com.java;

public class App {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Naresh";
        s1.id = 1234;
        s1.age = 35;
        Student.schoolName ="W2A";

        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(Student.schoolName);
        s1.attendClass();


        Student s2 = new Student();

        s2.name = "Tanmay";
        s2.id = 111;
        s2.age = 5;
        System.out.println(s2.name);
        System.out.println(s2.id);
        System.out.println(s2.age);
        System.out.println(Student.schoolName);
        s2.attendClass();
    }
}
