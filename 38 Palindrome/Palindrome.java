//38. Create a program to verify if a number is a palindrome.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to Reverse = ");
        int number = input.nextInt();
        int numberCopy = number;
        int rev = 0;
        // reverse logic
        while (number > 0) {
            rev = rev * 10 +number % 10;
            number = number / 10;
        }
        System.out.println("Reverse of " + numberCopy + " is = "+rev);
        if(numberCopy == rev){
            System.out.println(numberCopy+ " is a Palindrome Number");
        }else{
            System.out.println(numberCopy+ " is not a Palindrome Number");
        }
        input.close();
    }    
}
