package fstreamapi;

import java.util.Scanner;
import java.util.function.Function;

public class Challenge {
    /* Challenge 1:
    Em um sistema de backend, recebemos requisições HTTP de clientes e precisamos analisar qual método HTTP foi
    usado. Seu programa deve receber uma string contendo uma linha de log de requisição no formato: <METODO>
    <ROTA> <STATUS_CODE>. E deve exibir apenas o método HTTP utilizado (GET, POST, PUT, DELETE).
    ENTRADA
    Uma string contendo uma requisição HTTP. Ex: GET /home 200
    SAÍDA
    O método HTTP utilizado. Ex: GET
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        // TODO: Leia a linha de entrada:
//        String entrada = scanner.nextLine();
//
//        // TODO: Divida a string usando espaço como delimitador:
//        String http = null;
//        if (entrada.contains(" ")) {
//            String[] partesEntrada = entrada.split(" ");
//            http = partesEntrada[0];
//        }
//
//        // TODO: Exiba o primeiro elemento (método HTTP):
//        System.out.println(http);

        /* Challenge 2:
        Um backend precisa processar logs de acessos à API e validar endereços IP. Seu programa deve verificar
        se um IP contém exatamente 4 números separados por pontos (.) e cada número deve estar dentro do intervalo
        de 0 a 255.
        Se todas as condições forem atendidas, o IP é considerado válido. Caso contrário, ele será inválido.
        ENTRADA:
        O programa recebe uma única string, representando um endereço IP. Ex:
            192.168.1.1
            256.100.50.25
        SAÍDA:
        O programa deve imprimir:
            "ip valido" se o IP atender a todas as regras.
            "ip invalido" caso contrário.
        Atenção: os retornos da saida devem ser sem acentuação para esses casos.
         */

        String ip = scanner.nextLine();
        scanner.close();

        // TODO: Verifique se o IP é válido e imprima o resultado
        // TODO: Chame o método validarIP passando o IP como parâmetro e imprimir "ip valido" ou "ip invalido"
        // DICA: Use um if-else para verificar o retorno do método validarIP
        if (validarIP(ip)) {
            System.out.println("ip valido");
        } else {
            System.out.println("ip invalido");
        }
    }

    // Método para validar um endereço IP
    public static boolean validarIP(String ip) {
        // TODO: Divida a string IP pelo caractere "." e armazenar as partes em um array
        // DICA: Use o método split(".")
        String[] partesIp = ip.split("\\.");

        // TODO: Verificque se o array contém exatamente 4 partes
        // DICA: Se não tiver 4 partes, o IP é inválido (retorne false)
        if (partesIp.length == 4) {
        // TODO: Percorra cada parte do array e verificar se é um número válido
        // DICA: Use um loop for para percorrer todas as partes do IP
        // DICA: Para verificar se a parte é válida, chame o método ehNumeroValido(parte)
            for (String parte : partesIp) {
                if (!ehNumeroValido(parte)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // Método auxiliar para verificar se uma string representa um número válido entre 0 e 255
    private static boolean ehNumeroValido(String str) {
        try {
            int num = Integer.parseInt(str);
            return num >= 0 && num <= 255;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
