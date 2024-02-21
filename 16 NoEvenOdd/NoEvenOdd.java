//16.Create a program that determines if a number is odd or even.

import java.util.Scanner;

public class NoEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Number to check it is Even or Odd = ");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println("Number is Even = "+number);
        }else{
            System.out.println("Number is Odd = "+number);
        }
        input.close();
    }

}
