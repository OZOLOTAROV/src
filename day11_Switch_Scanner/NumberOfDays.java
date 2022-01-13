package day11_Switch_Scanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 9;

        if (number >= 1 && number <= 12) // numbers 1-12

            switch (number) {
                case 2:
                    System.out.println("28 Days");
                    break;

                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 Days");
                    break;

                default:
                    System.out.println("31 Days");
                    break;


            }
        else {
            System.out.println("Invalid Number");
        }

    }

    }

