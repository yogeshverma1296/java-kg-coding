// 36. Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Program of Fibonacci Series = ");
        // Scanner object input created
        Scanner input = new Scanner(System.in);
        System.out.println("Enter till you want to print Fibonacci Series = ");
        int till = input.nextInt();
        input.close();
        if(till<=0){
            System.out.println("0");
        }
        // Variables for Fibonacci Series
        int num1 = 0, num2 = 1, num3;
        System.out.println("Fibonacci Series = ");
        for(;(num1+num2)<=till;){
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }    
}
