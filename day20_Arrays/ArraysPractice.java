package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        //store teh elements: 10,20,50,70

        int[] numbers = {10,20,50,70}; // size:4

        System.out.println(Arrays.toString(numbers));

        System.out.println("______________________");
        //create a variable that contains 5 scores

        int[] scores = new int[5];
        scores [1]=85;
        scores[scores.length-1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;

        System.out.println(Arrays.toString(scores));//[0, 85,

        System.out.println("________________________");

        String month[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"}; // 0~11 (lenght -1)
        /*System.out.println(month[0]);//January
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);
        System.out.println(month[6]);
        System.out.println(month[7]);
        System.out.println(month[8]);
        System.out.println(month[9]);
        System.out.println(month[10]);
        System.out.println(month[11]);

        */

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);

        }

        System.out.println("_________________________");




    }
}
