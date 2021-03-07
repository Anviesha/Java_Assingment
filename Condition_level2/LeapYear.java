package Condition_level2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // ask for year
        System.out.println("Enter an year :");

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        /* If a year is divisible by 4 then it is leap year but
         if the year is century year like 2000, 1900, 2100 then itmust be divisible by 400 */

        if(((year%4 == 0) && (year%100!=0))|| ((year%400)==0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is a leap year");
    }
}
