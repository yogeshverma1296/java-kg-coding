//Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter Value of Number 1 = ");
        num1 = input.nextInt();
        System.out.println("Enter Value of Number 2 = ");
        num2 = input.nextInt();

        // all arithmetic operators (+,-,*,/,%)
        System.out.println("Addition (+)= " + (num1 + num2));
        System.out.println("Subtraction (-)= " + (num1 - num2));
        System.out.println("Multiplication (*)= " + (num1 * num2));
        System.out.println("Division (/)= " + (num1 / num2));
        System.out.println("Modulous (%) = " + (num1 % num2));

        input.close();
    }
}