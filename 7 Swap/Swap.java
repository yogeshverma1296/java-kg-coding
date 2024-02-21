import java.util.Scanner;
//7th challange Swap (using third variable)
public class Swap {
    public static void main(String[] args) {
        // using third variable ->
        int num1,num2,temp;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Value of Number 1 = ");
        num1=input.nextInt();
        System.out.println("Enter Value of Number 2 = ");
        num2=input.nextInt();
        // before swapping
        System.out.println("Before Swapping, num1 = "+num1+", num2 = "+num2);
        // Swapping logic
        temp=num1;
        num1=num2;
        num2=temp;
        // after swapping
        System.out.println("After Swapping, num1 = "+num1+", num2 = "+num2);
        // Scanner object close
        input.close();
    }
    
}