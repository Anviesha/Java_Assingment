package InputByUser;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length, breadth;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of rectangle :");
        length = scanner.nextDouble();

        System.out.println("Enter breadth of rectangle :");
        breadth = scanner.nextDouble();

        int area = (int) (length*breadth);
        System.out.println(" Area of rectangle:"+area);

    }
}
