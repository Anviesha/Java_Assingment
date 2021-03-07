package loops_level1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i, fact = 1;
        Scanner scanner = new Scanner(System.in);

        // input number to calculate factorial
        System.out.println("Enter number to calculate factorial: ");
        int number = scanner.nextInt();

        // calculate factorial of given number

        if((number==1)||(number== 0)){
            System.out.println("Factorial of number "+number+"!="+number);
        } else{
            for (i = 1; i <= number; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of a number "+number+" is "+fact);
        }

    }
}
