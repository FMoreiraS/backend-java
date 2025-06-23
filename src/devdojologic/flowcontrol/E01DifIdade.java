package devdojologic.flowcontrol;
/* Criar uma classe chamada CalculadoraDiferencaIdade
 * criar uma variável para guardar a idade 1
 * criar uma variável para guardar a idade 2
 * Imprimir a diferença no console
 */

public class E01DifIdade {
    public static void main(String[] args) {
        int age1 = 15;
        int age2 = 12;
    //System.out.println(age1 - age2);
    
    int differenceAges = age1 - age2;
    // MUITO IMPORTANTE: Nunca trabalhar diretamente com valores, mas com os VALORES EM MEMÓRIA.
    System.out.println("The difference between ages is " + differenceAges);

    }
}
