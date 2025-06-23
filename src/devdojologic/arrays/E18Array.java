package devdojologic.arrays;

import java.util.Scanner;

/* 1) Armazenar em dois vetores V1 e V2 9 valores numéricos inteiros e exibir o resultado da 
* multiplicação dos números do V1 com os correspondentes em V2.
*/

public class E18Array {
    public static void main(String[] args) {
        int[] v1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18};
        int[] vR = new int[9];

        for(int i = 0; i < v1.length; i++) {
            vR[i] = v1[i] * v2[i];
            System.out.println("vR[" + (i) + "] = " + v1[i] + " x " + v2[i] + " = " + vR[i]);
        }
        
        // Master's resolution:
        Scanner input = new Scanner(System.in);
        String resultMultiplicationArrays = "";

        for(int i = 0; i < v1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ":");
            v1[i] = input.nextInt();
            System.out.println("Vetor 2, posição " + i + ":");
            v2[i] = input.nextInt();
            vR[i] = v1[i] * v2[i];
            resultMultiplicationArrays += vR[i];
        }
        System.out.println(resultMultiplicationArrays);
    }
}
