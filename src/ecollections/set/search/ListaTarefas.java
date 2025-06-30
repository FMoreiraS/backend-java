package ecollections.set.search;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
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
            System.out.println("Lista de tarefas: " + tarefaSet);
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
                if (t.getStatus() == 'C') {
                    tarefasConcluidas.add(t);
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getStatus() == 'P') {
                    tarefasPendentes.add(t);
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getStatus() != 'C' && t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus('C');
                    System.out.println("A tarefa " + descricao + " foi marcada como concluída.");
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getStatus() != 'P' && t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus('P');
                    System.out.println("A tarefa " + descricao + " foi marcada como pendente.");
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.removeAll(tarefaSet);
        System.out.println("A lista de tarefas está limpa.");
    }
    /* marcarTarefaPendente(String descricao)
     */

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Arrumar o quarto");
        listaTarefas.adicionarTarefa("Estudar para a prova");
        listaTarefas.adicionarTarefa("Banhar o cachorro");
        listaTarefas.adicionarTarefa("Fazer compras do mês");
        listaTarefas.adicionarTarefa("Praticar Java");

        listaTarefas.exibirTarefas();
        System.out.println("A lista contém " + listaTarefas.contarTarefas() + " tarefa(s).");

        listaTarefas.removerTarefa("Banhar o cachorro");
        listaTarefas.exibirTarefas();
        System.out.println("A lista contém " + listaTarefas.contarTarefas() + " tarefa(s).");

        listaTarefas.marcarTarefaPendente("Arrumar o quarto");
        listaTarefas.marcarTarefaPendente("Estudar para a prova");
        listaTarefas.marcarTarefaPendente("Fazer compras do mês");
        listaTarefas.marcarTarefaPendente("Praticar Java");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Arrumar o quarto");
        listaTarefas.marcarTarefaConcluida("Estudar para a prova");
        listaTarefas.marcarTarefaConcluida("Fazer compras do mês");
        listaTarefas.marcarTarefaConcluida("Praticar Java");
        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}