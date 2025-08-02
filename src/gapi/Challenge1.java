package gapi;

import java.util.*;

public class Challenge1 {
    /* Challenge 1/2: Validador de senhas fortes (Estrutura de dados)
Para garantir a segurança de um sistema, é necessário validar se uma senha contém pelo menos:
8 caracteres;
uma letra maiúscula (A-Z);
uma letra minúscula (a-z);
um número (0-9).
Se a senha atender a todos os critérios, ela será considerada válida. Caso contrário, será considerada inválida.
#Entrada: Uma única linha contendo uma string que representa a senha a ser validada.
#Saída: exibir "senha valida" caso a senha atenda a todos os critérios, caso contrário, exibir "senha invalida".
Ex.: Senha123 = senha valida
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.nextLine();

        scanner.close();

        // TODO: Verifique se a senha é válida e imprime o resultado:
        if (validarSenha(senha)) {
            System.out.println("senha valida");
        } else {
            System.out.println("senha invalida");
        }
    }

    public static boolean validarSenha(String senha) {
        // TODO: Verifique se a senha tem pelo menos 8 caracteres. Se não tiver, retornar false.
        if (senha.length() < 8) return false;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        // TODO: Percorra cada caractere da senha e verifique se há pelo menos uma letra maiúscula e um número:
        // DICA: Use um loop para analisar cada caractere e marcar se é maiúscula ou número.
        List<Character> letras = senha.chars().mapToObj(c -> (char) c).toList();

        for (Character letra : letras) {
            if (letra == '0'
                || letra == '1'
                || letra == '2'
                || letra == '3'
                || letra == '4'
                || letra == '5'
                || letra == '6'
                || letra == '7'
                || letra == '8'
                || letra == '9') {
                temNumero = true;
            } else if (letra.toString().equals(letra.toString().toUpperCase(Locale.ROOT))) {
                temMaiuscula = true;
            } else {
                temMinuscula = true;
            }
            // Se já encontramos uma letra maiúscula e um número, podemos parar a verificação
            if (temMaiuscula && temMinuscula && temNumero) {
                return true;
            }
        }
        return false;
    }
}
