// 6.Create a program to add two numbers.
import java.util.Scanner;

public class AddTwoNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value of Number 1 = ");
        int num1= sc.nextInt();
        System.out.println("Enter Value of Number 2 = ");
        int num2=sc.nextInt();
        System.out.println("Addition is = "+(num1+num2));
        sc.close();
    }
}