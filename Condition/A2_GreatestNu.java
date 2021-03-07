package Condition;

import java.util.Scanner;

public class A2_GreatestNu {
    public static void main(String[] args) {

    int num1, num2;
        System.out.println("Enter first value for comparison");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();

        System.out.println("Enter second value for comparison");
        num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println(num1+ " is grater number in given two numbers");
        } else{
            System.out.println(num2+ " is grater number in given two numbers");
        }
    }
}
