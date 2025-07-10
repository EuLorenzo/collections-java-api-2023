package main.java.List.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinho;

    public CarrinhoCompras() {
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        Item itemParaRemover = null;
        for(Item i : carrinho) {
            if(i.getNome().equalsIgnoreCase(nome)) itemParaRemover = i;
        }
        carrinho.remove(itemParaRemover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : carrinho){
            int quantidade = i.getQuantidade();
            double preco = i.getPreco();
            total += preco * quantidade;
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        carrinhoCompras.adicionarItem("Banana", 5.0, 5);
        carrinhoCompras.adicionarItem("Tomate", 2.0, 10);

        System.out.println("Valor total: " + carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Banana");

        System.out.println("Valor total: " + carrinhoCompras.calcularValorTotal());
        carrinhoCompras.exibirItens();
    }
}

