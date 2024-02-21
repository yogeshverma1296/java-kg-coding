//11.Create a program to calculate the Area of a Triangle.
//Area of triangle = ½*B*H

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Value of B = ");
        int B = input.nextInt();
        System.out.println("Enter Value of H = ");
        int H = input.nextInt();
        int Area= (B*H)/2;
        System.out.println("Area of a Triangle = "+Area);
        input.close();
    }
}
