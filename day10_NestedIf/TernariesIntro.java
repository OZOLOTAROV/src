package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2 ==0){
            System.out.println("Even");//String
        }else{
            System.out.println("Odd");//String
        }

        System.out.println("_________________________");

        String result1 = (n%2 ==0)? "Even" : "Odd";

        System.out.println(result1);

        System.out.println("_____________________");








    }
}
