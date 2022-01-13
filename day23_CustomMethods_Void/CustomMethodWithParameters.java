package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {
        oddOrEven(10); // tne method demands additional information to complete its task
        ageOfPerson(1994);
    }

    //create a function that can check if a number is odd or even
    public static void oddOrEven(int number){
        if(number%2 == 0) {
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }


    // create a function that can display the age of person
    static public void ageOfPerson(int birthYear){
        int age = 2021 - birthYear;
        System.out.println("Your age is: " + age);
    }
}
