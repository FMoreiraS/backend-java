package ecollections.list.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo.
Implemente os seguintes métodos:
- adicionarNumero(int numero): Adiciona um número à lista.
- ordenarAscendente(): Ordena os números da lista em ordem ascendente usando a interface Comparable e a
  class Collections.
- ordenarDescendente(): Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.

 */

public class OrdenacaoNumeros {
    private List<Integer> numbers;

    public OrdenacaoNumeros() {
        numbers = new ArrayList<>();
    }

    public void adicionarNumero(int number) {
        this.numbers.add(number);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendentes = numbers;
        if (!numbers.isEmpty()) {
            Collections.sort(numerosAscendentes);
            return numerosAscendentes;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendentes = numbers;
        if (!numbers.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
            return numerosDescendentes;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirNumeros() {
        if (!numbers.isEmpty()) {
            System.out.println(numbers);
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros listaNumeros = new OrdenacaoNumeros();

        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(-5);
        listaNumeros.adicionarNumero(7);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(-13);
        listaNumeros.adicionarNumero(18);
        listaNumeros.adicionarNumero(21);

        listaNumeros.exibirNumeros();
        listaNumeros.ordenarAscendente();
        listaNumeros.exibirNumeros();
        listaNumeros.ordenarDescendente();
        listaNumeros.exibirNumeros();
    }

}
