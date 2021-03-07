package Operator;

import java.util.Scanner;

public class Convert_F_cel {
    public static void main(String[] args) {
        float temp;
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter temperature in Fahrenheit");
         temp = scanner.nextInt();
         temp = ((temp - 32)*5)/9;
         System. out. println("Temperature in Celsius = " + temp);
    }
}
