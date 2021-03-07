package loops_level1;

import java.util.Scanner;

// print  patterns
public class pattern1 {

    public static void main(String[] args) {

        // ask for number of rows to be printed
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers of rows need to be printed :");
        int n = input.nextInt();

        printSeries1(n);
        // printSeries2(n);
        // printSeries3(n);

        }

        // function to draw pattern1
        public static void printSeries1(int n){

        int i, j;

            for(i=0; i<n ; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //function to draw pattern2
        public static void printSeries2(int n){

        }

        //function to draw pattern3
        public static void printSeries3(int n){

            for (int i=1; i<=n; i++)
            {
                for (int j=1; j<i; j++){
                    System.out.print(" ");
                }
                for (int j=i; j<=n; j++){
                    System.out.print("0");
                    if(j%2==0){
                        System.out.println("0");
                    } else {
                        System.out.println("1");
                    }
                }
                System.out.println();
            }
        }
    }

