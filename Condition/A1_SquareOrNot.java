package Condition;

import java.util.Scanner;

public class A1_SquareOrNot {
    public static void main(String[] args) {

        // ask input length and breadth from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length:");
        int l = scanner.nextInt();

        System.out.println("Enter Braedth:");
        int b = scanner.nextInt();

        // check for square and reactanngle
        if(l==b)
            System.out.println("It is square");
        else
            System.out.println("It is Reactangle");

    }
}

