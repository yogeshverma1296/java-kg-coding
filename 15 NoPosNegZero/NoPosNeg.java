//15.Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;

public class NoPosNeg {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Value of Number to check for Positive, Negative or Zero = ");
        int number = input.nextInt();
        if(number>0){
            System.out.println("Number is Positive = "+number);
        }else if(number==0){
            System.out.println("Number is Zero = "+number);
        }else{
            System.out.println("Number is Negative = "+number);
        }
        input.close();
    }
}