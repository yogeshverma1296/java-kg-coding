// Prime Number Code ->

import java.util.Scanner;

public class Prime {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Number to check Prime or Not = ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        input.close();
    }
}


// My Logic
/*
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    // number input
		System.out.println("Enter the Value of Number =");
		int number = input.nextInt();
		if(isPrime(number)){
		    System.out.println("Number is Prime = "+number);
		}
		else{
		    System.out.println("Number is not a Prime = "+number);
		}
		input.close();
	}
	public static boolean isPrime(int number){
	    if(number<=1){
	        return false;
	    }
	    else{
	        for(int i = 2; i < number ; i++){
	            if(number%i == 0){
	                return false;
	            }
	        }
	    }
	    return true;
	}
}
*/