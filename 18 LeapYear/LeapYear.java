//18.Create a program that determines if a given year is a leap year (considering conditions like divisible by 4 but not 100, unless also divisible by 400).

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Year Value to check Leap Year or Not = ");
        int year = input.nextInt();
        if(year % 4 == 0 || year % 400 == 0){
            System.out.println("Year is Leap Year = "+year);
        }
        else{
            System.out.println("Year is not a Leap Year = "+year);
        }
        input.close();
    }
}
