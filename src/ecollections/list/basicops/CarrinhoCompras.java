package ecollections.list.basicops;

import java.util.List;
import java.util.ArrayList;

/* Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve
ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui
atributos como nome, preço e quantidade. Implemente os seguintes métodos:
1. adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço
    e quantidade especificados.
2. removerItem(String nome): Remove um item do carrinho com base no seu nome.
3. calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a
    quantidade de cada item.
4. exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.

 */

public class CarrinhoCompras {
    private List<Item> itemList;

    public CarrinhoCompras() {
        itemList = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int quantity) {
        itemList.add(new Item(name, price, quantity));
    }

    public void removerItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        if(!itemList.isEmpty()) {
            for(Item i : itemList) {
                if(i.getName().equalsIgnoreCase(name)){
                    itemsToRemove.add(i);
                }
            }
            itemList.removeAll(itemsToRemove);
        } else {
            System.out.println("Não há itens para remover.");
        }
    }

    public void calcularValorTotal() {
        double total = 0;
        if(!itemList.isEmpty()) {
            for(Item i : itemList) {
                total += i.getPrice();
            }
            System.out.println("Valor total: R$ " + total);
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public void exibirItens() {
        if(!itemList.isEmpty()) {
            System.out.println("============== Itens no carrinho ==============");
            for(Item i : itemList) {
                System.out.println(i.getQuantity() + " x " + i.getName() + " - R$ " + i.getPrice() + " / un.");
                System.out.println("---------------------------------------------");
            }
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Relógio digital", 250.49, 1);
        carrinho.adicionarItem("Chapéu de palha", 30, 1);
        carrinho.adicionarItem("Calça", 80, 4);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
        carrinho.removerItem("chapéu de palha");

        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
