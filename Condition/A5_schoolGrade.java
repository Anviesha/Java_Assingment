package Condition;

import java.util.Scanner;

public class A5_schoolGrade {
    public static void main(String[] args) {
        System.out.println("Please enter marks of Student : ");

        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if(marks<25)
            System.out.println("The grade is F");
        else if(marks>=25 && marks<45)
            System.out.println("The grade is E");
        else if(marks>=45 && marks<50)
            System.out.println("The grade is D");
        else if(marks>=50 && marks<60)
            System.out.println("The grade is C");
        else if(marks>=60 && marks<80)
            System.out.println("The grade is B");
        else if(marks>80)
            System.out.println("The grade is A");

    }
}

