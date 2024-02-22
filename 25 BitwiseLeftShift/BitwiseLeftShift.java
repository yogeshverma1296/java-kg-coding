//25. Create a program that shows use of left shift operator.

import java.util.Scanner;

public class BitwiseLeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int number = input.nextInt();
        System.out.println("How much you want to Left Shift, Enter Number = ");
        int shift = input.nextInt();
        //left shift bitwise operator
        System.out.println("Left Shift of No " + number + " by " + shift + " is = " + (number<<shift));

        input.close();
    }
}
