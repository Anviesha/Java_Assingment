package Inheritance;

public class Laptop {

    String name, processor, ram, hdd;
    int price;

    //parameterized constructor calling
    public Laptop(String name, int price, String processor, String ram, String hdd){
        this.name = name;
        this.price = price;
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
    }

    // parent print method
    public void printLaptopDetails() {

        System.out.println("Name: "+this.name+"\nPrice: $"+this.price+"\nProcessor: "+this.processor+"\nram: "+this.ram+"\nHDD: "+this.hdd);
        System.out.println("");
    }
}
