package main.java.Set.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String desc){
        tarefas.add(new Tarefa(desc));
    }

    public void removerTarefa(String desc){
        tarefas.remove(new Tarefa(desc));
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefas;
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> concluidas = new  HashSet<Tarefa>();

        for(Tarefa tarefa : tarefas){
            if(tarefa.isFinished()) concluidas.add(tarefa);
        }

        return concluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> pendentes = new  HashSet<Tarefa>();

        for(Tarefa tarefa : tarefas){
            if(!tarefa.isFinished()) pendentes.add(tarefa);
        }

        return pendentes;
    }

    public void marcarTarefaConcluida(String desc){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(desc)) tarefa.setFinished(true);
        }
    }

    public void marcarTarefaPendente(String desc){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(desc)) tarefa.setFinished(false);
        }
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }

    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Limpar");
        lista.adicionarTarefa("Cozinhar");
        lista.adicionarTarefa("Dirigir");
        lista.adicionarTarefa("Dirigir");
        lista.adicionarTarefa("Aprender");

        lista.marcarTarefaConcluida("Dirigir");
        lista.marcarTarefaConcluida("Aprender");

        lista.removerTarefa("Apren");

        lista.marcarTarefaPendente("Aprender");

        System.out.println(lista.exibirTarefas());
    }

}
