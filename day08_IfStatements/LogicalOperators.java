package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 18;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                       19 > 18 && "UK" == "USA"
        //                        true   &&   false ==> false

        System.out.println( name + " is eligible to vote: " +isEligible);



    }
}
