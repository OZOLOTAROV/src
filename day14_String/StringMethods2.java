package day14_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python");// Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        System.out.println("__________________________________");

        String email = "JohnSmith@yahoo.com";
         email = email.replace("yahoo", "gmail");


        System.out.println("email = " + email);

        System.out.println("__________________________________");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python" ;
        String sentence2 = sentence.replace("Python", ""); // "Java Java C# C# C++ C++"
        sentence2= sentence2.replace("   ", " ");

        System.out.println("sentence2 = " + sentence2);
    }
}
