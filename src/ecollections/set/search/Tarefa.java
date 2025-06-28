package ecollections.set.search;

public class Tarefa {
    private String descricao;
    private boolean status;

    public Tarefa (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
