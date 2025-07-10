package main.java.Set.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        this.alunos = new HashSet<Aluno>();
    }

    public void adicionarAluno(String nome, String mat, double nota){
        alunos.add(new Aluno(nome, mat, nota));
    }

    public void removerAluno(String mat){
        Aluno alunoAremover = null;

        for(Aluno a: alunos){
            if(a.getMatricula().equalsIgnoreCase(mat)) {
                alunoAremover = a;
                break;
            }
        }

        alunos.remove(alunoAremover);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorOdem = new TreeSet<Aluno>(alunos);
        return alunosPorOdem;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new comparatorPorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }

    public Set<Aluno> exibirTodosAlunos(){
        return alunos;
    }

    public static void main(String[] args) {
        GerenciadorAlunos g = new GerenciadorAlunos();

        g.adicionarAluno("Carlos 3", "4", 4);
        g.adicionarAluno("Carlos 1", "2", 9);
        g.adicionarAluno("Carlos", "1", 10);
        g.adicionarAluno("Carlos 2", "3", 2);
        g.adicionarAluno("Maria Alice", "3", 2);

        System.out.println(g.exibirAlunosPorNome());
        System.out.println(g.exibirAlunosPorNota());
        System.out.println(g.exibirTodosAlunos());
    }
}
