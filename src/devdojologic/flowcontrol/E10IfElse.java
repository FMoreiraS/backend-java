package devdojologic.flowcontrol;
//import java.util.Scanner;

/* História de cliente:
 * Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros 
 * para que eu possa realizar o processo de cadastramento: sexo, sendo válido apenas M ou F, e idade.
 * Se o sexo for Masculino e a idade maior ou igual a 18, o sistema deve imprimir alistamento obrigatório;
 * Se o sexo for Masculino e a idade menor que 18, o sistema deve imprimir alistamento não permitido;
 * Se o sexo for Feminino e a idade maior ou igual a 18, o sistema deve perguntar se a pessoa deseja se alistar;
 * Se o sexo for Feminino e a idade menor que 18, o sistema deve imprimir alistamento não permitido;
 */

public class E10IfElse {
    public static void main(String[] args) {
        /* Versão com Scanner, minha tentativa:
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Digite o nome do candidato ao alistamento:");
        String name = keyboard.next();

        System.out.println("Digite o sexo do candidato ao alistamento (válidos apenas m e f):");
        String sex = keyboard.next();
        if(sex.equalsIgnoreCase("M")) {
            sex = "Masculino";
        } else {
            sex = "Feminino";
        }

        System.out.println("Digite a idade do candidato ao alistamento:");
        int age = keyboard.nextInt();

        String answer;

        if(age < 18) {
            System.out.println("Alistamento não permitido.");
        } else if(sex.equals("Masculino")) {
            System.out.println("Alistamento obrigatório.");
        } else {
            System.out.println("A candidata deseja se alistar?");
            answer = keyboard.next();
            if(answer.equalsIgnoreCase("s") || answer.equalsIgnoreCase("sim")) {
                answer = "Sim";
            } else {
                answer = "Não";
            }
        }
        Segue a resolução do mestre: */

        char sex = 'F';
        int age = 18;

        if((sex == 'M' || sex == 'F') && age < 18 ) {
            System.out.println("Alistamento não permitido.");
        } else if(sex == 'M' & age >= 18) {
            System.out.println("Alistamento obrigatório.");
        } else if(sex == 'F' & age >= 18) {
            System.out.println("A candidata deseja se alistar?");
        }
    }
}
