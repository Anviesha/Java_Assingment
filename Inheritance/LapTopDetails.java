package Inheritance;

public class LapTopDetails extends Laptop{

    public LapTopDetails(String name, int price, String processor, String ram, String hdd) {
        super(name, price, processor, ram, hdd);
    }

    public static void main(String[] args) {

        // object create for parent methods
        Laptop   sony = new Laptop("Sony", 150000,"i3","5GB","100GB");
        Laptop   lenovo = new Laptop("Lenovo", 15000,"i5","9GB","1TB");

        // call parent method
        sony.printLaptopDetails();
        lenovo.printLaptopDetails();

    }
}
