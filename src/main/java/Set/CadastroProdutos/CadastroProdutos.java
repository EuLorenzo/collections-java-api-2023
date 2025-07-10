package main.java.Set.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos
    private Set<Produto> lista;

    public CadastroProdutos() {
        this.lista = new HashSet<Produto>();
    }

    public void adicionarProduto(int cod, String nome, double preco, int quantidade){
        lista.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(lista);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutorPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosPorPreco.addAll(lista);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos c = new CadastroProdutos();

        c.adicionarProduto(1, "Produto 5", 15d, 5);
        c.adicionarProduto(2, "Produto 0", 20d, 10);
        c.adicionarProduto(1, "Produto 3", 10d, 2);
        c.adicionarProduto(9, "Produto 9", 2d, 2);

        System.out.println(c.exibirProdutorPorPreco());

    }
}
