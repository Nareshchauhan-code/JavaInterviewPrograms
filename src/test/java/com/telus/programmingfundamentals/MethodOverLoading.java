package com.telus.programmingfundamentals;

public class MethodOverLoading {

    // 1. By changing the number of arguments
    public static int additionOfTotalSpent(int rent, int electricBill) {
        int result = rent + electricBill;
        return result;
    }

    public static int additionOfTotalSpent(int rent, int electricBill, int maintenanceCharges) {
        int result = rent + electricBill + maintenanceCharges;
        return result;
    }

    // 2 By changing the data type of the method
    public static float additionOfTotalSpent(int rent, int electricBill, float maintenanceCharges) {
        float result = rent + electricBill + maintenanceCharges;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(additionOfTotalSpent(12000, 4000));
        System.out.println(additionOfTotalSpent(12000, 5000, 3000));
        System.out.println(additionOfTotalSpent(12000, 5000, 3000.50f));


    }

}
