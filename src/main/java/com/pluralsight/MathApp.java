package com.pluralsight;

public class MathApp {
    public static void main(String[] args){

        //1
        int bobSalary = 80000;
        int garySalary = 100000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //2
        int carPrice = 42000;
        int truckPrice = 64000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is " + lowestPrice);

        //3
        float radius = 7.25f;
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Circle area: " + circleArea);

        //4
        float number = 5f;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root" + squareRoot);

        //5
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;

        int x = Math.abs(x2 - x1), y = Math.abs(y2 - y1);
        double distance = Math.sqrt((x * x)+(y * y));
        System.out.println(distance);

        //6
        double num = -3.8;
        double absValue = Math.abs(num);
        System.out.println(absValue);















    }
}
