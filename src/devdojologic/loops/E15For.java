package devdojologic.loops;

// 1) Elaborar um programa que apresente os quadrados dos números inteiros existentes 
// na faixa de valores de 15 até 200.

public class E15For {
    public static void main(String[] args) {
        for(int i = 15; i <= 200; i++) {
            System.out.println(i*i);
        }
        // 2) Elaborar um programa que calcule e apresente a tabuada de um número qualquer.
        
        System.out.println("\nMultiplication table:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(9 * i);
        }
    }
}
