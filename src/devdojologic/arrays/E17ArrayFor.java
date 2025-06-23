package devdojologic.arrays;

// A concluir

import java.util.Scanner;

// Challenge: Make a program that print grades entered by user and the mean of them, using array and
// just one for.

public class E17ArrayFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] grades = new double[4];
        double gradesMean = 0;
        
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Type grade " + (i+1) + ":");
            grades[i] = input.nextDouble();
            gradesMean += grades[i];
        }
        gradesMean /= grades.length;
        String gradesMsg = "\nGrade  1:" + grades[0] + "\nGrade  2:" + grades[1] + "\nGrade  3:" + grades[2] + "\nGrade  4:" + grades[3];
        System.out.println(gradesMsg);
        System.out.println("Mean of the grades: " + gradesMean);
    }
}
