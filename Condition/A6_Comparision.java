package Condition;

import java.util.Scanner;

public class A6_Comparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age of three people: ");
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();
        System.out.println("Age entered of three people :"+age1+" , "+age2+" , "+age3);

        int oldest = old(age1, age2, age3);
        int youngest = young(age1, age2, age3);

        System.out.println("The oldest in three is :"+oldest+"\nThe youngest in three is: "+youngest);
    }

    public static int old(int age1, int age2, int age3){
        int oldest=age1;
         if(age2 > oldest)
             oldest = age2;

         if(age3 > oldest)
             oldest = age3;

        return oldest;
    }

    public static int young(int age1, int age2, int age3){
        int yougest = age1;
         if(age2 < yougest)
             yougest = age2;

         if(age3 < yougest)
             yougest = age3;

         return yougest;
    }
}
