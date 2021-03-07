package InputByUser;

import java.util.Scanner;

public class Product_Sum {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Enter first number: ");
        num1 = scanner.nextInt();

        System.out.println( "Enter Second number: ");
        num2 = scanner.nextInt();

        System.out.println("Sum of two number:"+(num1+num2));
        System.out.println("Product of two number:"+(num1*num2));

    }
}
