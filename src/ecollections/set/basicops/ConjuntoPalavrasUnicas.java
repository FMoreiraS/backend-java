package ecollections.set.basicops;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {
            if (palavrasSet.contains(palavra)) {
                palavrasSet.remove(palavra);
                System.out.println("A palavra " + palavra + " foi retirada do conjunto.");
            } else {
                System.out.printf("O conjunto não contém a palavra %s.", palavra);
            }
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public void verificarPalavra(String palavra) {
        if (!palavrasSet.isEmpty()) {

            if (palavrasSet.contains(palavra)) {
                System.out.println(palavra + " está no conjunto.");
            } else {
            System.out.println(palavra + " não está no conjunto.");
            }
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasSet.isEmpty()) {
            System.out.println("Palavras do conjunto: " + palavrasSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Vermelho");
        conjuntoPalavrasUnicas.adicionarPalavra("Branco");
        conjuntoPalavrasUnicas.adicionarPalavra("Preto");
        conjuntoPalavrasUnicas.adicionarPalavra("Púrpura");
        conjuntoPalavrasUnicas.adicionarPalavra("Azul");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Vermelho");

        conjuntoPalavrasUnicas.removerPalavra("Azul");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.verificarPalavra("Azul");

        conjuntoPalavrasUnicas.removerPalavra("Laranja");
    }
}
