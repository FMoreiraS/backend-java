package dinterfacesandlambdas.challenges;
/* Challenge 2/2: Simulador de conta bancária
Crie uma classe ContaBancaria que contenha um número da conta, nome do titular e saldo.
O programa deve permitir depositar um valor e exibir o saldo atualizado. Para tornar o programa
mais seguro e estruturado, utilize encapsulamento, implementando métodos getters e setters para
manipular o saldo da conta. Além disso, garanta que o saldo inicial e os depósitos sejam sempre
valores positivos. Caso contrário, o programa deve exibir uma mensagem de erro antes de continuar.
#Entrada
Um número inteiro (número da conta).
Uma string (nome do titular).
Um número decimal (saldo inicial).
Um número decimal (valor do depósito).
#Saída
O saldo atualizado após o depósito no seguinte formato:
    Conta #<numero> - Titular: <titular> - Saldo: R$<saldo formatado com duas casas decimais>
Se o saldo inicial for negativo, exibir antes da saída:
    Erro: O saldo nao pode ser negativo.
Se o depósito for negativo ou zero, exibir antes da saída:
    Erro: O valor do deposito deve ser positivo.
 */
public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;

        // TODO: Verifica se o saldo inicial é negativo:
        if(this.saldo < 0) {
            // TODO: Retorne a mensagem de erro adequada:
            System.out.println("Erro: O saldo nao pode ser negativo.");
            // TODO: Interrompa a criação do objeto e não continua:
            return;
        }

        this.saldo = saldo;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor <= 0) { // Verifica se o valor do depósito é inválido
            System.out.println("Erro: O valor do deposito deve ser positivo.");
            return; // Interrompe a execução e não realiza o depósito
        }
        this.setSaldo(getSaldo() + valor); // Atualiza o saldo apenas se o depósito for válido
    }

    // TODO: Crie o método para exibir as informações da conta:
    public void exibirSaldo() {
        System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f",
                this.numero, this.titular, this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
