// 14.Create a program to convert Fahrenheit to Celsius
// °C = (°F - 32) × 5/9

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value in Fahrenheit = ");
        double Fahrenheit= input.nextDouble();
        double Celsius = (Fahrenheit - 32)*5/9;
        System.out.println("Fahrenheit is = "+Fahrenheit+", Fahrenheit to Celsius = "+Celsius);
        
        input.close();
    }
}
