import java.util.Scanner;
// 7th challange Swap (without using third variable)
public class SwapWithoutThird {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Value of Number 1 = ");
        num1=input.nextInt();
        System.out.println("Enter Value of Number 2 = ");
        num2=input.nextInt();
        // before swapping
        System.out.println("Before Swapping, num1 = "+num1+", num2 = "+num2);
        // Swapping logic
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        // after swapping
        System.out.println("After Swapping, num1 = "+num1+", num2 = "+num2);
        // Scanner Object input closed
        input.close();
    }   
}
