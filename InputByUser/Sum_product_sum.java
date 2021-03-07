package InputByUser;

import java.util.Scanner;

public class Sum_product_sum {

        public static void main(String[] args) {
            int num1, num2, sum, product;

            Scanner scanner = new Scanner(System.in);

            System.out.println( "Enter first number: ");
            num1 = scanner.nextInt();

            System.out.println( "Enter Second number: ");
            num2 = scanner.nextInt();

            sum= (num1+num2);
            product = num1*num2;

            System.out.println("Sum of two number:"+(sum));
            System.out.println("Product of two number:"+(product));

            System.out.println("Sum of product and sum numbers: "+ (sum+product));
            System.out.println("Sum of product and sum numbers: "+ (sum*product));




        }
    }

