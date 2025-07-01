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
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    System.out.println("A tarefa " + t.getDescricao() + " foi removida.");
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
        if (tarefaParaRemover == null) {
            System.out.printf("A tarefa %s não está na lista.\n", descricao);
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
        return tarefaSet.size();
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

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (!t.getStatus()) {
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
                if (!t.getStatus() && t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(true);
                    System.out.println("A tarefa " + descricao + " foi marcada como concluída.");
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void marcarTarefaPendente(String descricao) {
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    t.setStatus(false);
                    System.out.println("A tarefa " + descricao + " foi marcada como pendente.");
                    break;
                }
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
        System.out.println("A lista de tarefas está limpa.");
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Quantidade de tarefas da lista: " + listaTarefas.contarTarefas());

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
        listaTarefas.removerTarefa("Banhar o cachorro");

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