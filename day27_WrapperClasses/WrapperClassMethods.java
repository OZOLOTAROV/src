package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str); //int

        System.out.println(num+1);//124
        System.out.println(str+1);//1231

        String str2 = "10.5";

        Double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "true";
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("-------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);// Integer

        System.out.println("x = " + x);

        System.out.println("--------------------");

        // isDigit()

        char ch1 = '$';

        boolean r2 = Character.isDigit(ch1);
        boolean r3 = Character.isLetter(ch1);
        boolean r4 = !Character.isLetterOrDigit(ch1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("------------------");

        String s = "ab1cde2efg3hi4";
        int sum = 0;

        for (char each : s.toCharArray()) {
            if ( Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);
    }
}
