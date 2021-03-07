package Polymorphism;

public class Undergraduate extends Degree {
    public void getDegree()
    {
        System.out.println("I get under graduate degree ");
    }

    public static void main(String[] args) {
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();

        Degree du = new Postgraduate();

        d.getDegree();
        u.getDegree();
        p.getDegree();

        du.getDegree();

    }
}
