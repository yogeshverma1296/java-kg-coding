//31. Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Integer to find sum of the Digits = ");
        int number = input.nextInt();
        int sum = 0;
        while(number>0){
            sum += number%10;
            number /= 10;
        }
        System.out.println("Sum of Digits = "+sum);
        input.close();
    }    
}
