//Write a Program to print Reverse Right Half Pyramid

import java.util.Scanner;

public class ReverseRightHalfPyramid {
    // ReverseRightHalfPyramid
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Till you want to print Reverse Right Half Pyramid = ");
        int till = input.nextInt();
        System.out.println("Reverse Right Half Pyramid is = ");
        //Reverse Right Half Pyramid Logic
        for (int i = till; i >= 1; i--) {
            for (int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
