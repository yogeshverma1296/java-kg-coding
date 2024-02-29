// 33. Create a program to find the Greatest Common Divisor (GCD) of two integers.

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // num 1
        System.out.println("Enter the Value of Number 1 = ");
        int num1 = input.nextInt();
        // num 2
        System.out.println("Enter the Value of Number 2 = ");
        int num2 = input.nextInt();
        // invoking gcd function
        int gcd = GCD(num1, num2);
        System.out.println("Greatest Common Divisor of Two Numbers = "+num1+" and "+num2+" is = "+gcd);
        // closed the scanner object
        input.close();
    }
    public static int GCD(int num1, int num2){
        int gcd = 1;
        int least = Math.min(num1, num2);
        for(int i = 2; i <= least ; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        // While Equivalent 
        // int i = 2;
        // while(i <= least){
        //     if(num1 % i == 0 && num2 % i == 0){
        //         gcd = i;
        //     }
        //     i++;
        // }
        return gcd;
    }
}
