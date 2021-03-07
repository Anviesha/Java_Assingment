package loops_level1;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        int mult = 0;

        // input the number for multiplication table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter multiplication table for number: ");
        int multNumber = scanner.nextInt();

        System.out.println("Multiplication table of "+multNumber);

        //calculating table
        for (int i = 0; i <= 10; i++) {
            mult = multNumber * i;
            System.out.print(mult+" ");
        }
    }
}
