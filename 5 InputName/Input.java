//5.Create a program to input name of the person and respond with "Welcome NAME to KG Coding"
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name = ");
        String name = input.nextLine();
        System.out.println("Welcome "+name+" to KG Coding");
        input.close();
    }
}