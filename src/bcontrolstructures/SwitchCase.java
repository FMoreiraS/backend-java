package bcontrolstructures;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

    // Existe outra forma mais recente de usar o switch, que emprega "->" seguidos das ações de cada case,
    //dispensando o uso de break.

        var scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch(option) {
            case 1 -> System.out.printf("O número digitado foi %d.\n", option);
            case 2 -> System.out.printf("O número digitado foi %d.\n", option);
            case 3 -> System.out.printf("O número digitado foi %d.\n", option);
            case 4 -> System.out.printf("O número digitado foi %d.\n", option);
            case 5, 6 -> System.out.printf("O número digitado foi %s.\n", option);
            default -> System.out.println("O número digitado não está entre as opções.");
        };

    //  A nova forma também possui palavra reservada para indicar o retorno de cases: yield.
        option = scanner.nextInt();
        String message = switch(option) {
            case 1 -> String.format("O número digitado foi %d.\n", option);
            case 2 -> String.format("O número digitado foi %d.\n", option);
            case 3 -> String.format("O número digitado foi %d.\n", option);
            case 4 -> String.format("O número digitado foi %d.\n", option);
            // Como se usaria a palavra reservada yield:
            case 5, 6 -> {
                String verification = option == 5 ? "5" : "6";
                yield String.format("O número digitado foi %s.\n", verification);
            }
            default -> "O número digitado não está entre as opções.";
        };
    }
}
