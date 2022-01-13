package day38_Inheritance.carTask;

public class Car {

    public String brand, model, color;
    public int year;
    public double price;
    public long miles;



    public Car(String brand, String model, int year, double price,String color, long miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }
}
