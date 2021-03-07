package Condition;

import java.util.Scanner;

public class Uppearcase_Lowercase {
    public static void main(String[] args) {

        // check given character is uppearcase or lowercase

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character :");
        char ch = scanner.next().charAt(0);

        if(ch>='A' && ch<='Z')
            System.out.println("Letter enter in uppearcase");
        else if(ch>='a' && ch<= 'z')
            System.out.println("Letter enter is in lowercase");
        else
            System.out.println("letter entered is not a letter");
    }
}
