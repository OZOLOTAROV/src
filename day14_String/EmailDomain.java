package day14_String;

public class EmailDomain {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        //domain
        int beginningIndex = email.indexOf("@") +1 ;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        System.out.println("________________________");

        String str1 = "Java is fun, Java is cool";

        int beg = str1.lastIndexOf("J");

        String s1 = str1.substring(0, 10+1);
        String s2 = str1.substring(beg);
        //

        System.out.println(s1);
        System.out.println(s2);





    }
}
