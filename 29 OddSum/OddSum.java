//29. Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Till for Sum all Odd Numbers = ");
        int N = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= N ; i++){
            if (i % 2 != 0) {
                sum+=i;
            }
        }
        System.out.println("Sum of Odd Numbers = "+sum);
        input.close();
    }
}
