package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

    //123Enter
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your programming language");
        String programming = input.nextLine();

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);





    }
}
