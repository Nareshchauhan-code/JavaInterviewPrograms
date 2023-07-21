package com.retest;

public class Employee {
    // default field
    String name;

    // public field
    public int id;

    // private salary
    private double salary;

    //arg-constructor to initialize fields
    public Employee(String name, int id,
                    double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // getter method for name
    public String getName() {
        return name;
    }

    // getter method for id
    public int getId() {
        return id;
    }

    // getter method for salary
    public Double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee ob = new Employee("Naresh", 12, 1000.3);
        System.out.println(ob.getId());
        System.out.println(ob.getName());
        System.out.println(ob.getSalary());
    }
}