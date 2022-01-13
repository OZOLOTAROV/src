package utilities;

import java.util.Arrays;

public class StringUtility {

    // prints each character of given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    // reverses the given string and returns the reversed string
    public static String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // checks if the given string is palindrome, returns boolean
    public static boolean IsPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    // checks if given string is anagram, returns boolean
    public static boolean anagram(String str1, String str2){ //"acb", "bca"
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    // removes the duplicates from given string, returns String
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length() ; i++) {
            char each = str.charAt(i);//aaaaaabbbbbbbccc

            if(result.contains(""+ each)){
                result += each;
            }


        }
        return result;
    }
}

