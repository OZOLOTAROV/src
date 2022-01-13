package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Oleksandr");

        Student student2 = new Student("Maksim", 'M');

        Student student3 = new Student("Katia",11);

        Student student4 = new Student("Andrew", 12, 'A');

        Student student5 = new Student("Oleg",'M', 25);

        Student student6 = new Student("Alina",'F', 24,15);

        Student student7 = new Student("Oleksandr",'M', 27, 54, 'B');

        System.out.println(student1 == student2);

        Student[] students= { student1, student2, student3, student4, student5, student6,student7};

        System.out.println(Arrays.toString(students));


    }
}
