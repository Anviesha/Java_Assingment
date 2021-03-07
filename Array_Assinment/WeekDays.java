package Array_Assinment;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        // defining days array
        String[] daysOfweek = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};

        // ask user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day of week:");
        int dayNumber = scanner.nextInt();

        if(dayNumber<=0 || dayNumber>7){
            System.out.println("Entered day number is not valid ");
        } else
            System.out.println("Day of the week is "+daysOfweek[dayNumber-1]);

    }
}
