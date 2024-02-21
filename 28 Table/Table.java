//28. Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number for Table = ");
        int number= input.nextInt();
        System.out.println("Enter the Till = ");
        int till= input.nextInt();
        for(int i = 1 ; i <= till ; i++){
            System.out.println(number+" * "+ i + " = "+(number*i));
        }
        input.close();
    }
}
