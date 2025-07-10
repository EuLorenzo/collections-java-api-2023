package main.java.Set.ListaTarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean isFinished;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.isFinished = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        return "{ Descricao='" + descricao + '\'' +
                ", isFinished=" + isFinished + " }";
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
