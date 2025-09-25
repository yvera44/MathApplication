package com.pluralsight;

public class MathApp {
    public static void main(String[] args){

        int bobSalary = 80000;
        int garySalary = 100000;
        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        int carPrice = 42000;
        int truckPrice = 64000;
        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is " + lowestPrice);


    }
}
