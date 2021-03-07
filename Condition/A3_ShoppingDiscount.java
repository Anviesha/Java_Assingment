package Condition;

import java.util.Scanner;

public class A3_ShoppingDiscount {
    public static void main(String[] args) {

        System.out.println("Please enter quantity for purchase:");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        double discount,totalCost, costOfOneUnit=100.00 ;

        totalCost = quantity * costOfOneUnit;

        if(quantity>1000)
        {
            discount = totalCost * 0.10;
            System.out.println("Discount Given to Customer :"+discount+" \nTotal cost customer has to pay :"+(totalCost-discount));
        } else{
            System.out.println("Total cost customer has to pay :"+totalCost);
        }
    }
}
