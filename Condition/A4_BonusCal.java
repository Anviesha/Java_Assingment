package Condition;

import java.util.Scanner;

public class A4_BonusCal {
    public static void main(String[] args) {

        double bonus;
        System.out.println("Please enter number years of service : ");
        Scanner scanner = new Scanner(System.in);
        int empYearOfService = scanner.nextInt();

        System.out.println("Please enter employee salary : ");
        int empSalary = scanner.nextInt();

        if(empYearOfService>5){
            bonus = empSalary * 0.05;
            System.out.println("Bonus amount for Employee:"+bonus);
        }
    }
}
