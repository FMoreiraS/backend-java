package cexceptions;

import java.util.Locale;
import java.util.Scanner;

public class CodeChallenge2 {
    public static void main(String[] args) {
        // CHALLENGE 2/2
        Scanner scanner = new Scanner(System.in);

        // Lendo a entrada do usuário
        System.out.println("Insira um URL: ");
        String url = scanner.nextLine();

        // TODO: Normalize a URL: removendo espaços e convertendo para minúsculas
        url = url.toLowerCase(Locale.ROOT);
        if(url.startsWith(" ") || url.endsWith(" ")) url = url.trim();

        // TODO: Exiba a URL normalizada
        System.out.println(url);

        scanner.close();
    }
}
