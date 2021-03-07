package loops_level1;

import java.util.Scanner;

public class AvgNumbers {
    public static void main(String[] args) {

        averagNumber();
    }

    static void averagNumber(){
        int n, num=0, sum =0, avg=0;

        // Ask for number of values
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number to be entered to calculate average : ");
        n = scanner.nextInt();

        //calculate sum and average of the number
        System.out.print("enter "+n+" numbers ");

        for (int i=0; i<n; i++){
        num = scanner.nextInt();
        sum += num;
        }

        avg = sum/n;
        System.out.println("Sum of "+n+ " number is "+sum+" and average is "+avg);
    }
}
