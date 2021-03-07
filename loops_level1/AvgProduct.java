package loops_level1;

import java.util.Scanner;

public class AvgProduct {

    public static void main(String[] args) {
        String ch ="";
        int sum=0, number, product=1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number you want to enter to calculate average and product :");
        int num = scanner.nextInt();

        for(int i=0;i<num;i++){

            System.out.println(" Do you want to quit (Press Q else enter number)");
            ch = scanner.next();
            if(ch.equalsIgnoreCase("q"))
                break;
            else{
                number = Integer.parseInt(ch);
                sum = sum+number;
                product = product*number;
            }
        }
        System.out.println("Average of numbers :"+ (sum/num) + " Product of numbers :"+ product);
    }
}
