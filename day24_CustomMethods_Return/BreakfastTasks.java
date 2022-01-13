package day24_CustomMethods_Return;

import javax.swing.*;

public class BreakfastTasks {

    public static void main(String[] args) {
        initials("Wooden","Spoon");
        System.out.println("____________________");
        domain("oleksandrzolotarov94@gmail.com");
        System.out.println("____________________");
        nameOfMonth(4);
        System.out.println("____________________");
    }
        // 1. Create a method that can display the initials of the person..... Initials();
        public static void initials(String firstName, String lastName){
        String initials = firstName.charAt(0) +"."+lastName.charAt(0);
        initials = initials.toUpperCase();
        System.out.println("initials = " + initials);
        }

        //  2. Create a method that can display the domain of the email ....domain();
        public static void domain( String email){ //Cydeo@gmail.com
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
            System.out.println("domain = " + domain);

        }

        //  3. Create a method that can display the name of the month based on the given number to the method
        public static void nameOfMonth (int numberOfMonth){
        String name = "";
        if (numberOfMonth >= 1 && numberOfMonth <= 12){
            name = (numberOfMonth == 1)?"January" : (numberOfMonth == 2)?"February" :(numberOfMonth == 3)?"March" :
                    (numberOfMonth == 4)?"April" :(numberOfMonth == 5)?"May" :(numberOfMonth == 6)?"June" :
                            (numberOfMonth == 7)?"July" :(numberOfMonth == 8)?"August" :(numberOfMonth == 9)?"September" :
                                    (numberOfMonth == 10)?"October" :(numberOfMonth == 11)?"November" : "December";


        }else{
            name = "invalid";
        }
            System.out.println("Month name = " + name);
        }

        //  4. Create a method that can print the name of the day based on the given number to the method
        public static void nameOfDay(int number,int year){
        String nameOfDay = "";



        }






















}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */