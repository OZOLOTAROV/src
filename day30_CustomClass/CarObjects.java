package day30_CustomClass;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota","Camry","White", 2021, 35000);

        System.out.println(car1);

        Car car3 = new Car();
        car3.setInfo("Audi","Q7", "Red", 2019,45000);


        System.out.println(car3);

        Car[] cars = { car1,car3};
    }
}
