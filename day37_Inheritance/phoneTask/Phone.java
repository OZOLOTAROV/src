package day37_Inheritance.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static {
        hasBattery = true;
    }

    public void call(long number){
        System.out.println(brand+ " " + model + " is calling " + number);
    }

    public void text(long number){
        System.out.println(brand+ " " + model + " is texting " + number);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
}
/*
Phone Task:
		1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color

				Methods:
					setInfo()
					call(long phoneNumber)
					text(long phoneNumber)
					toString()


 */