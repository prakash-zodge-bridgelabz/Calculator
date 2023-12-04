package com.bridgelabz;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to my calculator program");
        Calculator c1 = new Calculator();
        c1.UC_1_Addition(2,3);
        c1.UC_2_Subtraction(5,2);
        c1.UC_3_Multiplication(3,5);
        c1.UC_4_Division(10,5);
    }
    public void UC_1_Addition(double a, double b){
        System.out.println("Addition : "+(a+b));
    }
    public void UC_2_Subtraction(double a, double b){
        System.out.println("Substraction : "+(a-b));
    }
    public void UC_3_Multiplication(double a, double b){
        System.out.println("Multiplication : "+(a*b));
    }
    public void UC_4_Division(double a, double b){
        System.out.println("Division : "+(a/b));
    }
}
