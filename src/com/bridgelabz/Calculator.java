package com.bridgelabz;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator program");
        Calculator c1 = new Calculator();
        c1.UC_1_Addition(2,3);
    }
    public void UC_1_Addition(double a, double b){
        System.out.println("Addition : "+(a+b));
    }
}
