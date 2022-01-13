package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {7,8,9};

        int[][] arr2D = { {1,2,3}, {4,5,6}, {7,8,9}};

        // 3 dimensional array contains 2 d arrays

        int[][][] arr3d = { { {1,2,3}, {4,5,6}, {7,8,9}}, {{10,20,30}, {40,50,60}, {70,80,90}} };
        //
        //{{10,20,30}, {40,50,60}, {70,80,90}}
        System.out.println(Arrays.deepToString(arr3d));
        // {40,50,60}
        System.out.println(Arrays.deepToString(arr3d[1]));
        //9
        System.out.println(arr3d[0][2][2]);

        System.out.println("____________________");

        for (int[][] aech2D : arr3d) {
            for (int[] each1D: aech2D){
                for (int element : each1D) {
                    System.out.println(element);

                }
            }

        }




    }
}
