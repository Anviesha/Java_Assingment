package Condition_level2;

import java.util.Scanner;

public class EmplyoeeWorking {

    public static void main(String[] args) {

    // ask user age, sex and maritual status

        Scanner input = new Scanner(System.in);
        System.out.println("Enter age of the employee :");
        int age = input.nextInt();

        System.out.println("Enter sex of the employee(M/F): ");
        String sex = input.next();

        System.out.println("Enter maritual status of employee(Y/N): ");
        String maritualStatus = input.next();

    // setting rules for emplyoment
        if (sex.equalsIgnoreCase("F"))
            System.out.println("Females will work only inurban areas");
        else if (sex.equalsIgnoreCase("M") && (age>=20 && age<=40 ))
            System.out.println("Males having age between 20 to 40 can work anywhere");
        else if (sex.equalsIgnoreCase("M") && (age>40 && age<=60 ) )
            System.out.println("Males having age between 20 to 40 can work anywhere");
        else
            System.out.println("Error");
    }
}
