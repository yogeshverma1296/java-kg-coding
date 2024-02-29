//32. Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Number 1 Input
        System.out.println("Enter the Value of Number 1 = ");
        int num1 = input.nextInt();
        
        // Number 2 Input
        System.out.println("Enter the Value of Number 2 = ");
        int num2 = input.nextInt();
        
        // my LCM Logic
        for (int lcmnumber = 1 ; lcmnumber <= (num1*num2) ; lcmnumber++){
            if(lcmnumber % num1 == 0 && lcmnumber % num2 == 0){
                System.out.println("Number who is LCM of "+num1+" and "+num2+" is = "+lcmnumber);
                break;
            }
        }
        
        // scanner object close
        input.close();
    }
}