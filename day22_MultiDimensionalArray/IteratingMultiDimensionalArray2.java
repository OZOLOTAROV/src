package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3} , {4,5,6,7,8}, {9,10,11,12,13}  };

        for (int i = arr2D.length - 1; i >= 0; i--) { // i=index number of arrays starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.println(arr2D[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("____________________");

        for (int i = 0; i < arr2D.length; i++) { // i: indexes of each 10 array started from 0

            for (int j = arr2D.length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j]+" ");

            }
            System.out.println();

        }
        }


    }


