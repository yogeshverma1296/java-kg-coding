//9. Create a program to calculate product of two floating points numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Float 1 = ");
        float num1=input.nextFloat();
        System.out.println("Enter Value of Float 2 = ");
        float num2=input.nextFloat();
        System.out.println("Product of Two Float is = "+(num1*num2));
        input.close();
    }
}
