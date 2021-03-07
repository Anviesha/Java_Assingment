package loops_level1;

import java.util.Scanner;

public class GSDandHCF {
    public static void main(String[] args) {
        // input numbers to calculate GSD or HCF
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first numbers for GCD calculation :");
        int a = scanner.nextInt();

        System.out.println("Enter second numbers for GCD calculation :");
        int b = scanner.nextInt();
        int gcd = 1;

        //
        for(int i=1; i<=a && i<=b;i++){
            if(a%i==0 && b%i ==0)
                gcd = i;
        }
        System.out.println("GSD of numbers "+a+" "+b+" is "+gcd);
    }
}