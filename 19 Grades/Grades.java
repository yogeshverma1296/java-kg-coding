//19.Create a program that calculates grades based on marks
//A -> above 90% B -> above 75%
//C -> above 60% D -> above 30%
//F -> below 30%

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks = ");
        double marks = sc.nextDouble();
        if(marks>90){
            System.out.println("Grade is A for Marks = "+marks);
        }
        else if(marks>75){
            System.out.println("Grade is B for Marks = "+marks);
        }
        else if(marks>60){
            System.out.println("Grade is C for Marks = "+marks);
        }
        else if(marks>30){
            System.out.println("Grade is D for Marks = "+marks);
        }
        else if(marks<30){
            System.out.println("Grade is F for Marks = "+marks);
        }
        else{
            System.out.println("Enter Correct Marks and try again");
        }
        sc.close();
    }
}
