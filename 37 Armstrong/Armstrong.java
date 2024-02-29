// Armstrong Number ->

// My Code ->

// import java.util.Scanner;

// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner input = new Scanner(System.in);
// 	    // number input
// 		System.out.println("Enter the Value of Number =");
// 		int number = input.nextInt();
// 		input.close();
// 		if(isArmstrong(number)){
// 		    System.out.println("Number is Armstrong = "+number);
// 		}
// 		else{
// 		    System.out.println("Number is not an Armstrong = "+number);
// 		}
// 	}
// 	public static boolean isArmstrong(int number){
// 	    int numberCopy = number;
// 	    int digits = 0;
// 	    while(number>0){
// 	        digits ++;
// 	        number /= 10;
// 	    }
// 	   // digits calculated
// 	   number = numberCopy;
// 	   int sum = 0;
// 	   // calculation of sum
// 	   while(number>0){
// 	       sum += Math.pow(number % 10,digits);
// 	       number /= 10;
// 	   }
// 	   return numberCopy == sum;
// 	}
// }

// CoPilot Code ->

import java.util.Scanner;

public class Armstrong {
    // method used to take input
    static int input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number = ");
        int number = input.nextInt();
        input.close();
        return number;
    }

    // Method for checking if number is Armstrong or not
    static boolean isArmstrong(int number) {
        int digits = 0, sum = 0, num = number;
        // Loop for counting number of digits
        for (digits = 0; num > 0; digits++) {
            num /= 10;
        }
        num = number;
        while (num > 0) {
            sum += Math.pow(num % 10, digits);
            num /= 10;
        }
        return sum == number;
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Program to find that number is Armstrong or Not - ");
        // invoking input() method
        int number = input();
        // using StringBuilder to append output messages
        StringBuilder output = new StringBuilder();
        output.append("Number is ");
        if (isArmstrong(number)) {
            output.append("Armstrong = ");
        } else {
            output.append("not an Armstrong = ");
        }
        output.append(number);
        // printing the output
        System.out.println(output);
    }
}
