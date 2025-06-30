package ecollections.set.search;

public class Tarefa {
    private String descricao;
    private char status = 'P';

    public Tarefa (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return descricao + " - status: " + status;
    }
}
