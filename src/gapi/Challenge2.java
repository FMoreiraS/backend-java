package gapi;

import java.util.Scanner;

public class Challenge2 {
    /* Uma loja virtual precisa calcular o frete de um pedido com base no peso.
    Até 1kg: R$5,00
    Entre 1kg e 5kg: R$10,00
    Acima de 5kg: R$20,00
    #Entrada: um número decimal representando o peso do pedido.
    #Saída: o valor do frete formatado.
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();

        double frete;

        // TODO: Crie uma estrutura condicional para determinar o valor do frete:
        // TODO: Se o peso for até 1kg, o frete é R$5,00
        if (peso <= 1) {
            frete = 5.0;
        // TODO: Se o peso for entre 1kg e 5kg, o frete é R$10,00
        } else if (peso > 1 && peso <= 5) {
            frete = 10.0;
        // TODO: Se o peso for acima de 5kg, o frete é R$20,00
        } else {
            frete = 20.0;
        }

    // TODO: Exiba o valor do frete formatado (com duas casas decimais):
        System.out.printf("R$%.2f%n", frete);

    // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
