//13.Create a program to calculate Compound interest.
//Compound Interest = P(1 + R/100)t

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Value of Principal = ");
    double Principal= input.nextDouble();
    System.out.println("Enter Value of Rate = ");
    double Rate=input.nextDouble();
    System.out.println("Enter Value of Time (in years only) = ");
    double Time=input.nextDouble();
    double CompoundInterest = Principal*(Math.pow((1+(Rate/100)),Time)) ;
    System.out.println("Compound Interest is = "+CompoundInterest);
    input.close();
  }
}
