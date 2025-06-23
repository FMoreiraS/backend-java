package devdojologic.flowcontrol;

/* Eu, como administrador do sistema, quero permitir que os usuários cadastrem o nome de usuário (login)
 * no sistema para agilizar o processo de migração do sistema antigo para o novo.
 * O usuário não pode deixar o login vazio "", ou criar um usuário com o login "admin" ou "administrador".
 * Se o valor entrado for válido, o sistema deverá exibir uma mensagem "<nome> cadastrado com sucesso".
 * Senão o sistema deverá mostrar o erro "Usuário invalido".
*/
import java.util.Scanner;

public class E09IfElseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome de usuário:");
        String username = input.next();

        /* if(username == null || username == "" || username == "admin" || username == "administrador") {
            System.out.println("Unvalid user");
        } else {
            System.out.println(username + " registered successfully.");
        }
        */
        // Isso não funciona, pois não se pode comparar strings com o operador ==, apenas com .equals().
        /* Pode-se acrescentar a equals o parâmetro IgnoreCase, para desconsiderar variações no tamanho
         * de letras nos valores de strings;
         * Podemos ainda usar no lugar de equals:
         * isBlank, para indicar espaços como valor;
         * isEmpty, para indicar vazio, "", no valor.
        */

        if(username.isEmpty() || username.isBlank() || username.equalsIgnoreCase("admin") || username.equalsIgnoreCase("administrador")) {
            System.out.println("Unvalid user");
        } else {
            System.out.println(username + " registered successfully.");
        }
    }
}
