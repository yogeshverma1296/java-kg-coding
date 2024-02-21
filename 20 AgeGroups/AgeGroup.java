//20.Create a program that categorize a person into different age groups
//Child -> below 13 Teen -> below 20
//Adult -> below 60 Senior-> above 60

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of Age = ");
        int age = input.nextInt();

        if(age <= 13){
            System.out.println("You are Child");
        }
        else if(age <= 20){
            System.out.println("You are Teen");
        }
        else if(age <= 60){
            System.out.println("You are Adult");
        }
        else if(age > 60){
            System.out.println("You are Senior");
        }
        else{
            System.out.println("Enter Correct Age");
        }
        input.close();
    }
}
