package ecollections.set.ordering;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                alunoSet.remove(alunoParaRemover);
                break;
            }
        }
        if (alunoParaRemover == null) {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosAZ = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            return alunosAZ;
        } else {
            return alunoSet;
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararPorNota());
        if (!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        } else {
            return alunoSet;
        }
    }

    public void exibirAlunos() {
        if (!alunoSet.isEmpty()) {
            System.out.println("Alunos cadastrados" + alunoSet);
        } else {
            System.out.println("O conjunto está vazio.");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.exibirAlunos();

        gerenciador.adicionarAluno("Teresa", 1L, 9);
        gerenciador.adicionarAluno("Tomás", 2L, 8);
        gerenciador.adicionarAluno("Antônio", 3L, 9);
        gerenciador.adicionarAluno("João", 4L, 7);
        gerenciador.adicionarAluno("Maria", 5L, 8);

        gerenciador.exibirAlunos();

        System.out.println("Alunos por nome:");
        System.out.println(gerenciador.exibirAlunosPorNome());

        System.out.println("Alunos por nota:");
        System.out.println(gerenciador.exibirAlunosPorNota());

        gerenciador.removerAluno(3);
        gerenciador.exibirAlunos();
    }
}
