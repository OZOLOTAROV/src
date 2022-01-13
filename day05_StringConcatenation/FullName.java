package day05_StringConcatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Oleksandr";
        String lastName = "Zolotarov";
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName;

                //Full name of the person is _____

        System.out.println("Full name of person is " + fullName);

             // ___ is __ years old
        System.out.println( fullName + " is " + age + " years old");

           // FullName is JobTitle, works at CompanyName, and FullName's salary is Salary
        System.out.println( fullName + " is " + jobTitle +",works at " + companyName
                +",and " + fullName + "'s salary is $" + salary);


    }

}
