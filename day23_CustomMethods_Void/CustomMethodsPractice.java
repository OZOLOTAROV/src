package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {
        helloWorld5Times();
        System.out.println("______________________");
        helloCydeo5times();
        System.out.println("______________________");
        evenNumbers();

    }

    // create a function that can print hello world 5 times ===>HelloWorld5Times
    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }


    // create a function that can print hello Cydeo 5 times ===>HelloCydeo5Times
    public static void helloCydeo5times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello Cydeo");

        }
    }

    //create a function that can print all the even numbers from 1~10
    public static void evenNumbers(){
        for (int i = 2; i <= 11; i+=2) {
            System.out.println(i);
        }


    }
}