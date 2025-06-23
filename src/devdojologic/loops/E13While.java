package devdojologic.loops;
import java.util.Scanner;

/* 10) Apresentar ao usuário uma tela solicitando um login e depois uma senha, o usuário e 
 *senha corretos devem estar armazenados em constantes no seu programa. Se o usuário acertar 
 * o usuário e a senha, exibir a mensagem ACESSO CONCEDIDO, caso contrário exibir a mensagem 
 * ACESSO NEGADO e voltar a pedir o usuário e senha, essa condição deve-se repetir até que o 
 * usuário acerte a combinação.
*/

public class E13While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = "morus-user";
        String password = "morus99";
        String accessAcp = "ACESSO CONCEDIDO";
        String accessNgt = "ACESSO NEGADO";
        String accessState = "unlogged";
        
        while(accessState.equals("unlogged")) {
            System.out.println("Log in\nDigit the username:");
            String userAttemp = input.next();
            System.out.println("Digit the password:");
            String passwordAttemp = input.next();
            if(userAttemp.equals(user) && passwordAttemp.equals(password)) {
                System.out.println(accessAcp);
                accessState = "logged";
            } else {
                System.out.println(accessNgt);
            }
        }
        // A resolução do mestre poupa linhas e deixa o código mais limpo:

        final String login = "User";
        final String senha = "password"; //final torna as variáveis constantes, inalteráveis após a declaração.
        // boolean exibirTelaLogin = true; é uma opção que foi removida, para limpar o código.
        while(true) { // Aqui viria o boolean.
            System.out.println("Digite seu login:");
            String loginDigitado = input.nextLine();
            System.out.println("Digite sua senha:");
            String senhaDigitada = input.nextLine();
            if(login.equals(loginDigitado) && senha.equals(senhaDigitada)) {
                System.out.println("ACESSO CONCEDIDO");
                break; // O break aqui não afeta o if, mas para o loop mais próximo, o while.
            } // else {
              //  System.out.println("ACESSO NEGADO"); O else foi substituído pelo break.
        }
        System.out.println("ACESSO NEGADO");
    }
}