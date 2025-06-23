package devdojologic.flowcontrol;

/* Como gerente eu gostaria que meus usuários údessem digitar qual o tipo da conta e o sistema 
 * imprimisse qual a porcentagem de juros que aquela conta irá oferecer, com o intuito de agilizar 
 * o acesso às informações. Os tipos de contas são:
 * CONTA_POUPANÇA (0.05%);
 * CONTA_CORRENTE (0.02%);
 * CONTA_INVESTIMENTO (0.1%);
 * Caso a conta não exista, imprimir "Conta inexistente".
 */

public class E01Switchcase {
    public static void main(String[] args) {
        String account = "Investiment account";
        //double interestRate;

        switch(account) {
            case "Savings account":
            System.out.println("The Savings account offers interest rate of 0.05"); //interestRate = 0.05;
            break;
            case "Checking account":
            System.out.println("The checking account offers interest rate of 0.02"); //interestRate = 0.02;
            break;
            case "Investiment account":
            System.out.println("The investiment account offers interest rate of 0.1"); //interestRate = 0.1;
            break;
            default:
            System.out.println("Inexistent account.");
        }

    }
}
