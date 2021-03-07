    package Polymorphism;

    public class PrintNumber {
        public static void main(String[] args)
        {
            // define variable
            PrintNumber p = new PrintNumber();

            int n= 2;
            float f= 1.2f;
            String d = "Vapasi";

            // call the methode for overloading
            p.println(n);
            p.println(f);
            p.println(d);

        }
    // overloading integer
        void println(int n)
        {
            System.out.println("Number is :"+n);
        }

    // overloading float
        void println(float f)
        {
            System.out.println("Number is :"+f);
        }

    // overloading string
        void println(String d)
        {
            System.out.println("String is :"+d);
        }
    }
