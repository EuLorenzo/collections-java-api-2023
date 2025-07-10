package main.java.Set.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String matricula;
    private Double nota;

    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno o) {
        return this.nome.compareTo(o.getNome());
        //return nota.compareTo(o.getNota());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }
}

class comparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno o1, Aluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
