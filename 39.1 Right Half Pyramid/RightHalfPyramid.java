// Write a Program to print Right Half Pyramid

import java.util.Scanner;

public class RightHalfPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Till you want to print Right Half Pyramid = ");
        int till = input.nextInt();
        System.out.println("Right Half Pyramid is = ");
        //Right Half Pyramid Logic
        for (int i = 1; i <= till; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        input.close();
    }
}
