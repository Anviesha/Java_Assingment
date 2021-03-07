package Condition_level2;

import java.util.Scanner;

public class ReversingNumber {

    public static void main(String[] args) {
        reverseNo();
    }

    static void reverseNo(){

        // ask for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to be reversed : ");
        int number = input.nextInt();
        int temp = 0;
        //reverse given number

        while(number != 0){
            int div = number % 10;
            temp = temp * 10 + div;
            number /=10;
        }
        System.out.println("Reversed Number is :"+temp);
    }
}
