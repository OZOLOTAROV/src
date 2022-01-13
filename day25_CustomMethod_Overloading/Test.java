package day25_CustomMethod_Overloading;

import utilities.StringUtility;

import java.io.FilterOutputStream;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("________________");

        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("________________");

        String word = "Civic";

        boolean palindrome = StringUtility.IsPalindrome(word);

        System.out.println("palindrome = " + palindrome);

        System.out.println("____________________");

        String[] names = {"Anna","Java","Python","racecar","Mom","Cydeo"};
        int count=0;

        for (String each : names) {
            if(StringUtility.IsPalindrome(each)){
                count++;
            }
        }

        System.out.println(count);

        System.out.println("____________________");

        String s2 = "aaaaaaaabbbbbbbbbbccccccccdddddd";
        String nonDuplicates = StringUtility.removeDuplicates(s2);
        System.out.println(nonDuplicates);









    }
}
