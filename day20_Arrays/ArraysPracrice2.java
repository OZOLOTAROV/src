package day20_Arrays;

import java.util.Arrays;

public class ArraysPracrice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
       /*
       letters[0] = 'A';
       letters[1] = 'B';
       */
        for (char i = 'A',j = 0; j < letters.length; i++,j++) {
            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters));




    }
}
