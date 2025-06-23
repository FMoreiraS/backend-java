package devdojologic.loops;

/* Como usuário eu gostaria de ter um menu visual que seja navegável através de números. O menu deve ser exibido
 * da seguinte forma:
 * 1. Calcular imposto
 * 2. Depositar salário
 * 3. Sair
*/
import java.util.Scanner;

public class E12WhileMenu {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int menuState = 0;
        double tax = 0.05;
        double deposit = 0;
        //double salary = 3500D;

        while(menuState == 0) {
            System.out.println("Selecione uma opção: \n1. Calcular imposto\n2. Depositar salário\n3. Sair");
            menuState = keyboard.nextInt();
            if(menuState == 1) {
                System.out.println("Digite o salário para o cálculo:");
                double salary = keyboard.nextDouble();
                double taxCalc = salary * tax;
                System.out.println("Valor do imposto: " + taxCalc);
            } else if(menuState == 2) {
                System.out.println("Digite o valor para o depósito:");
                deposit = keyboard.nextDouble();
                System.out.println("Depósito realizado com sucesso");
            } else if(menuState == 3) {
                System.out.println("Saindo...");
                menuState = 4;
            } else {
                System.out.println("Opção inválida");
            }
            if(menuState == 4) {
                System.out.println("Volte sempre!");
            } else {
                menuState = 0;
            }
            // Resolução do mestre:
            int opção = 0;

            while(opção != 3) {
                System.out.println("1. Calcular imposto");
                System.out.println("2. Depositar salário");
                System.out.println("3. Sair");
                System.out.println("Digite sua opção.");
            }
            System.out.println("Programa encerrado.");
        }
    }
}
