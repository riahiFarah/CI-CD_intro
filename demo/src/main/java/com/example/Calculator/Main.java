package com.example.Calculator;


public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + Calculator.add(a, b));
        System.out.println("Subtraction: " + Calculator.subtract(a, b));
        System.out.println("Multiplication: " + Calculator.multiply(a, b));
        
        try {
            System.out.println("Division: " + Calculator.divide(a, b));
        } catch (IllegalArgumentException e) {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
