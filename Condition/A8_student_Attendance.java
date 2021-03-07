package Condition;

import java.util.Scanner;

public class A8_student_Attendance {

    public static void main(String[] args) {

        // assingment 8 and 9 student allowed for exam and medical check

        System.out.println("Total Number of Classes held:");
        Scanner scanner = new Scanner(System.in);
        double noOfClassHeld = scanner.nextDouble();

        System.out.println("Number of Classes Attended:");
        double noOfClassAttended = scanner.nextDouble();

        System.out.println("Does student has any medical issue (Y/N):");
        String mediCond = scanner.next();

        double classAttendance = (noOfClassAttended / noOfClassHeld) *100;
        System.out.println("Class Attendance percentage:"+ (int)classAttendance +"%");


        if (classAttendance<75 && mediCond.equals("N"))
            System.out.println("Student is not allowed for Exam.");
        else if (classAttendance<75 && mediCond.equals("N"))
            System.out.println("Student is allowed for Exam");
        else
            System.out.println("Student is allowed for Exam");

    }
}
