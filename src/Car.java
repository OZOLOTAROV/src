package src;

public class Car {

    public String make, model;
    public int year;
    public double price;
    public String color;

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public Car(String make, String model, int year, double price) {
        this(make, model, year);
        this.price = price;
    }

    public Car(String make, String model, int year, double price, String color) {
        this( make, model, year, price);
        this.color = color;
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=$" + price +
                ", color='" + color + '\'' +
                '}';
    }
}



class CarObjects{

    public static void main(String[] args) {

        day32_Constructors.Car car1 = new day32_Constructors.Car("Toyota");

        day32_Constructors.Car car2 = new day32_Constructors.Car("Honda", "Accord");

        day32_Constructors.Car car3 = new day32_Constructors.Car("Lexus", "ES350", 2019);

        day32_Constructors.Car car4 = new day32_Constructors.Car("BMW", "X7", 2021, 128000);

        day32_Constructors.Car car5 = new day32_Constructors.Car("Mercedes", "ML350", 2015, 21000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}

