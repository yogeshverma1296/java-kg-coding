//30. Write a function that calculates the factorial of a given number

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to find Factorial of = ");
        int N = input.nextInt();
        int fact = 1;
        for(int i = 1; i <= N ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of Number = " + N + " is = "+fact);
        input.close();
    }
}
