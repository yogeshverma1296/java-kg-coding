//12.Create a program to calculate simple interest.
//Simple Interest = (P x R x T)/100 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Value of P = ");
        float P = input.nextFloat();
        System.out.println("Enter Value of R = ");
        float R = input.nextFloat();
        System.out.println("Enter Value of T = ");
        float T = input.nextFloat();
        float SimpleInterest = (P*R*T)/100;
        System.out.println("Simple Interest = "+(SimpleInterest));
        input.close();
    }
}
