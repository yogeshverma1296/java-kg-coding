//17. Create a program that determines the greatest of the three numbers.
import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Value of Number 1 = ");
        int num1=input.nextInt();
        System.out.println("Enter Value of Number 2 = ");
        int num2=input.nextInt();
        System.out.println("Enter Value of Number 3 = ");
        int num3=input.nextInt();
        if(num1>=num2&&num1>=num3){
            System.out.println("Number 1 is Greatest = "+num1);
        }
        else if(num2>=num1&&num2>=num3){
            System.out.println("Number 2 is Greatest = "+num2);
        }
        else{
            System.out.println("Number 3 is Greatest = "+num3);
        }
        input.close();
    }
}
