package Condition;

public class A9_Expressions {
    public static void main(String[] args) {

        //define variables
        int x= 2, y=5, z=0;

        System.out.println("1. x==2 results "+(x==2));
        System.out.println("2. x!=5 results "+(x!=5));
        System.out.println("3. x!=5 && y>=5 results "+((x!=5) && (y>=5)));
        System.out.println("4. z!=0 || x==2 results "+((z!=0) || (x==2)));
        System.out.println("5. !(y<10) results  "+(!(y<10)));
    }
}
