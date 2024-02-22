// 23. Create a program that shows bitwise XOR of two numbers.

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number 1 = ");
        int number1 = input.nextInt();
        System.out.println("Enter the Number 2 = ");
        int number2 = input.nextInt();
        System.out.println("Bitwise XOR(^) Operation on = "+number1+" and "+number2+" is = "+(number1^number2));
        
        input.close();
    }
}
