package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEach(arr1);

        System.out.println("------------------");

        double[] arr2 = {1.5,2.5,3.5,4.5};
        ArraysUtility.printEach(arr2);

        System.out.println("------------------");

        char[] arr3 = {'A','B','C','D'};

        ArraysUtility.printEach(arr3);

        System.out.println("------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1,5);

        System.out.println("r1 = " + r1);


        System.out.println("------------------");








    }
}
