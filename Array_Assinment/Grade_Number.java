    package Array_Assinment;

    import java.util.Scanner;

    public class Grade_Number {
        public static void main(String[] args) {
            // define variables
            int numberOfGrades, grade, avg, minimum, maximum, sum=0;

            // ask user to input grades
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tell us how many grades you want to enter :");
            numberOfGrades = scanner.nextInt();

            //define array for grades
            int[] numbersArray = new int[numberOfGrades];

            // finding and printing average of grades
            System.out.println("Enter the grads now:");

            for(int i=0; i<numberOfGrades; i++){
                grade = scanner.nextInt();
                numbersArray[i] = grade;
                sum = sum + numbersArray[i];
            }

            // printing the average, highest and lowest grades
            System.out.println("Average of grades :"+(sum/numberOfGrades));

            // minimum and maximum intialization
            minimum = numbersArray[0];
            maximum = numbersArray[0];

            // printing highest and lowest grades

            for(int j=0;j<numberOfGrades;j++) {
                if (numbersArray[j] > maximum)
                    maximum = numbersArray[j];
                if (numbersArray[j] < minimum)
                    minimum = numbersArray[j];
            }

            System.out.println("Highest Grades is :"+maximum);
            System.out.println("Lowest Grades is :"+minimum);
        }
    }
