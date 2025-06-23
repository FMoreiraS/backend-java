package dinterfacesandlambdas.challenges;

/* Challenge 1/2: Sistema de pedidos de loja virtual
Um e-commerce precisa de um sistema para armazenar pedidos. Crie uma classe Pedido que contém um número do pedido,
nome do cliente e valor total. O programa deve receber essas informações e imprimir um resumo do pedido.
#Entrada
A entrada consiste em três valores, que devem ser informados pelo usuário em três linhas separadas:
Um número inteiro representando o ID do pedido.
Uma string representando o nome do cliente.
Um número decimal representando o valor total do pedido.
#Saída
A saída deve exibir os detalhes do pedido em uma única linha, no seguinte formato:
  Pedido #<ID> - Cliente: <Nome do Cliente> - Total: R$<Valor Total>
>> O valor total deve ser exibido com duas casas decimais, mesmo que o número inserido não as tenha.
 */

public class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    // TODO: Crie o construtor para inicializar os atributos da classe:
    public Pedido(int id, String cliente, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    // TODO: Implemente o método para exibir as informações do pedido formatadas corretamente:
    public void exibirPedido() {
        //Saída esperada: Pedido #<ID> - Cliente: <Nome do Cliente> - Total: R$<Valor Total>
        System.out.printf("Pedido #%d - Cliente: %s - Total: R$%.2f",
                this.id, this.cliente, this.valorTotal);
    }
}