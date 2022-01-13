package day17_While_DoWhile;

import java.sql.SQLOutput;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while(str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println("_________________________");

        String s = "java java java python python python";

        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")){

            if (s.contains("java")){
                s = s.replace("java", "");
            }
            if (s.contains("python")){
                s = s.replaceFirst("python", "");
            }
        }


        System.out.println(countJava);

    }
}
