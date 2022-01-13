package day38_Inheritance.carTask;

public class Tesla extends Car {
    public Tesla(String brand, String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilotr(){
        System.out.println( brand + " " + model + " in autopilot mode");
    }

}
/*
Tesla:
                extra methods:
                    autoPilot();
 */