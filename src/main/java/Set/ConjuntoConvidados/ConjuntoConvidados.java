package main.java.Set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String name, int codigo){
        convidadosSet.add(new Convidado(name, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidado = null;

        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite) {
                convidado = c;
                break;
            }
        }

        convidadosSet.remove(convidado);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new  ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados.");


    }
}
