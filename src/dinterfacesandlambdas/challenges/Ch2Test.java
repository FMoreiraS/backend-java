package dinterfacesandlambdas.challenges;

import java.util.Scanner;

public class Ch2Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int numero = scanner.nextInt();
        int numero = 123456;
        //scanner.nextLine();

        //String titular = scanner.nextLine();
        String titular = "Carlos Carvalho";

        double saldo = scanner.nextDouble();

        // TODO: Verifique se o saldo inicial é negativo e encerra o programa:
        if(saldo < 0) {
            // TODO: Retorne a condição para informar que o saldo nao pode ser negativo:
            System.err.println("Erro: O saldo nao pode ser negativo.");
            scanner.close();
            return;
        }

        double deposito = scanner.nextDouble();

        // Verificação se o depósito é inválido e encerra o programa
        if (deposito <= 0) {
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            scanner.close();
            return;
        }

        // TODO: Crie um objeto ContaBancaria com os valores lidos:
        ContaBancaria conta = new ContaBancaria(numero, titular, saldo);

        conta.depositar(deposito);

        conta.exibirSaldo();

        scanner.close();
    }
}
