package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable to contain 5 names;

        String myGroup[] = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulia";
        myGroup[4] = "Mikael";

        // System.out.println(myGroup);// hashcode
        System.out.println(Arrays.toString(myGroup));




    }
}
