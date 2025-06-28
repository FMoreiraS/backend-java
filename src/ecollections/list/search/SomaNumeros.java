package ecollections.list.search;

import java.util.List;
import java.util.ArrayList;

public class SomaNumeros {
    private List<Integer> integerList;

    public SomaNumeros() {
        this.integerList = new ArrayList<>();
    }

    // Adiciona um número à lista de números.
    public void adicionarNumero(Integer numero) {
        integerList.add(numero);
    }

    // Calcula a soma de todos os números na lista e retorna o resultado.
    public Integer calcularSoma() {
        Integer soma = 0;
        if(integerList.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for(Integer i: integerList) {
                soma += i;
            }
        }
        return soma;
    }

    // Encontra o maior número na lista e retorna o valor.
    public Integer encontrarMaiorNumero() {
        // Integer maiorNum = 0; não basta: o maior valor de uma lista pode ser negativo.
        int maiorNum = Integer.MIN_VALUE; // Isto invoca o menor valor possível para um Integer.
        if(!integerList.isEmpty()) {
            maiorNum = integerList.get(0);
            for(Integer i: integerList) {
                if (i >= maiorNum) {
                    maiorNum = i;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return maiorNum;
    }

    // Encontra o menor número na lista e retorna o valor.
    public Integer encontrarMenorNumero() {
        int menorNum = Integer.MAX_VALUE;
        if(!integerList.isEmpty()) {
            for(Integer i: integerList) {
                if (i <= menorNum) {
                    menorNum = i;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        return menorNum;
    }

    // Retorna uma lista contendo todos os números presentes na lista.
    public void exibirNumeros() {
        if(!integerList.isEmpty()) {
            System.out.println("Lista de inteiros = " + integerList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números da lista é igual a " + somaNumeros.calcularSoma());

        System.out.println("O maior número da lista é igual a " + somaNumeros.encontrarMaiorNumero());

        System.out.println("O menor número da lista é igual a " + somaNumeros.encontrarMenorNumero());

        
    }
}
