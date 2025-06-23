package cexceptions;

import java.util.Locale;
import java.util.Scanner;

public class CodeChallenge1 {
    public static void main(String[] args) {
        // CHALLENGE 1/2
        // Criando um objeto Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        String nome = scanner.nextLine();

        // Lendo o número inteiro (ID)
        int id = scanner.nextInt();

        // TODO: Formate o identificador (minúsculas e sem espaços):
        String identificador = nome.toLowerCase(Locale.ROOT).replaceAll(" ", "")
                                + "-" + id;

        // TODO: Exiba o resultado:
        System.out.println(identificador);

        // Fechando o scanner
        scanner.close();
    }
}
