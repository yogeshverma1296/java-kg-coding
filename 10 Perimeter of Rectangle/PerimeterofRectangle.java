//10.Create a program to calculate Perimeter of a rectangle.
//Perimeter of rectangle ABCD = A+B+C+D
import java.util.Scanner;

public class PerimeterofRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of A = ");
        int A=input.nextInt();
        System.out.println("Enter Value of B= ");
        int B=input.nextInt();
        System.out.println("Enter Value of C = ");
        int C=input.nextInt();
        System.out.println("Enter Value of D = ");
        int D=input.nextInt();
        //Perimeter (ABCD) = A+B+C+D
        int Perimeter=A+B+C+D;
        System.out.println("Perimeter of Rectangle is = "+Perimeter);
        input.close();
    }
}
