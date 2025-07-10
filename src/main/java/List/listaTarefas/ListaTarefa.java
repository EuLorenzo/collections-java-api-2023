package main.java.List.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    final private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : this.tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) tarefasParaRemover.add(t);
        }
        this.tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("Teste 1");
        listaTarefa.adicionarTarefa("Teste 2");
        listaTarefa.adicionarTarefa("Teste 3");

        listaTarefa.obterDescricoesTarefas();
    }
}
