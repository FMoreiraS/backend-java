package ecollections.set.search;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas () {
        tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa (String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaSet.remove(t);
                    System.out.println("A tarefa " + t.getDescricao() + " foi removida.");
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public int contarTarefas() {
        if (!tarefaSet.isEmpty()) {
            return tarefaSet.size();
        } else {
            System.out.println("A lista de tarefas está vazia.");
            return 0;
        }
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getStatus()) {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
        return tarefasConcluidas;
    }
}
