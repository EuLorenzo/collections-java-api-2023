package main.java.Set.ConjuntoPalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> conjunto;

    public ConjuntoPalavrasUnicas() {
        this.conjunto = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra){
        conjunto.add(palavra);
    }

    public void removerPalavra(String palavra){
        String p = null;

        for(String s: conjunto){
            if(s.equalsIgnoreCase(palavra)){
                p = s;
                break;
            }
        }

        conjunto.remove(p);
    }

    public void verificarPalavra(String palavra){
        boolean palavraExiste = false;

        for(String s: conjunto){
            if(s.equalsIgnoreCase(palavra)) {
                palavraExiste = true;
                break;
            }
        }

        if(palavraExiste) System.out.println(palavra + " existe no conjunto.");
        else System.out.println(palavra + " nao existe no conjunto.");
    }

    public void exibirPalavras(){
        System.out.println(conjunto);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        conjunto.adicionarPalavra("A");
        conjunto.adicionarPalavra("A");
        conjunto.adicionarPalavra("B");

        conjunto.exibirPalavras();
    }
}
