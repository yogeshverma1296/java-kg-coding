//27. Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int number = input.nextInt();
        // Number Even Odd
        if((number & 1) == 0){
            System.out.println("Number is Even = "+number);
        }
        else{
            System.out.println("Number is Odd = "+number);
        }
        input.close();
    }
}

