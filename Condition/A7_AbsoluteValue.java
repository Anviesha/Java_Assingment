package Condition;

import java.util.Scanner;

public class A7_AbsoluteValue {

    public static void main(String[] args) {

        System.out.println("Enter any number(+/-):");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        n = (-1) * n;

        System.out.println("Absolute value of given number is:"+n);
    }

}
