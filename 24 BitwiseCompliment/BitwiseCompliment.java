// 24. Create a program that shows bitwise compliment of a number.

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to find Compliment  = ");
        int number = input.nextInt();
        System.out.println("Bitwise Compliment(~) Operation on = "+number+" is = "+(~number));
        
        input.close();
    }
}
