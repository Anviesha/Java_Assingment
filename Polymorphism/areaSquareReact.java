package Polymorphism;

import java.util.Scanner;

public class areaSquareReact {

    public static void main(String[] args) {
     //Crate object of the class
        areaSquareReact area = new areaSquareReact();

    // Ask user for which area need to be calculated
        System.out.println("Calculate area of square or rectangle: (S/R) :");

        Scanner input = new Scanner(System.in);

        String ch = input.next();

    // Call function to calcualte area
        if(ch.equalsIgnoreCase("S"))
        {
            System.out.println("Enter side of squares:");
            int side = input.nextInt();
            area.calculateArea(side);
        }

        if(ch.equalsIgnoreCase("R"))
        {
            System.out.println("Enter length and breadth of reactangle:");
            int length = input.nextInt();
            int breadth = input.nextInt();

            area.calculateArea(length,breadth);
        }
    }

    //calculate area of square
    void calculateArea(int side)
    {
        int area;
        area = side*side;
        System.out.println("Area of square: "+area);
    }

    // calculate area of reactangle
    void calculateArea(int length, int breadth)
    {
        int area;
        area = length * breadth;

        System.out.println("Area of Reactangle:"+ area);
    }
}
