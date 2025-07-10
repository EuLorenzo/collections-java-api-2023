package main.java.List.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumeros;

    public SomaNumeros() {
        listaNumeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for(Integer i : listaNumeros){
            soma = soma + i;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = 0;

        for(Integer i : listaNumeros){
            if(i > maior){
                maior = i;
            }
        }

        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = 0;

        for(Integer i : listaNumeros){
            if(i < menor){
                menor = i;
            }
        }

        return menor;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros soma = new SomaNumeros();

        soma.adicionarNumero(1);
        soma.adicionarNumero(19);
        soma.adicionarNumero(10);

        System.out.println("Maior numero: " + soma.encontrarMaiorNumero());
        System.out.println("Menor numero: " + soma.encontrarMenorNumero());
        System.out.println("Soma numeros: " + soma.calcularSoma());
        soma.exibirNumeros();

    }
}
