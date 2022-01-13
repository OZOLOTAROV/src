package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] numbers = { 1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

/*
        String str = "Java";
        System.out.println(str.toString());
*/
        System.out.println("--------------------");

        int[] scores = {95,100,55,68,85,78};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score:" +scores[0]);
        System.out.println("Max Score:" +scores[scores.length-1]);

        System.out.println("___________________________");

        int[] arr1 = {1,3,2};
        int[] arr2 = {1,2,3};

        boolean r1 = Arrays.equals(arr1,arr2);
        System.out.println(r1);


    }
}
