//27. Write a program to check if a given number is even or odd using bitwise operators.

import java.util.Scanner;

public class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int number = input.nextInt();
        System.out.println("How much you want to Right Shift, Enter Number = ");
        int shift = input.nextInt();
        //right shift bitwise operator
        System.out.println("Right Shift of No " + number + " by " + shift + " is = " + (number>>shift));

        input.close();
    }
}

