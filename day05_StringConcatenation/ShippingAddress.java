package day05_StringConcatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "James King",
                buildingNumber = "1123B",
                streetName = "Jones Nranch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "22031A";

        System.out.println(name+ " \n" +buildingNumber + " " + streetName + " \n" +city + ", " + state + " " + zipCode);

        String address = name+ " \n" +buildingNumber + " " + streetName + " \n" +city + ", " + state + " " + zipCode;

    }

}
/*
Create a class called ShippingAddress.java
Declare the following variables:
name
buildingNumber
streetName
city
state
zipCode

Use concatenation to print the full shipping address

 */