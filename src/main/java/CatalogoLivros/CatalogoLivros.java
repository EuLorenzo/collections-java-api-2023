package main.java.CatalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        catalogo = new ArrayList<Livro>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for (Livro livro : catalogo) {
                if(livro.getAutor().equalsIgnoreCase(autor)) livrosPorAutor.add(livro);
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();

        if(!catalogo.isEmpty()){
            for (Livro livro : catalogo) {
                int anoLivro = livro.getAnoPublicacao();

                if(anoLivro >= anoInicial && anoLivro <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }

        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        return catalogo.stream().filter(l -> l.getTitulo()
                .equalsIgnoreCase(titulo)).findFirst().orElse(null);
    }


    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);

        catalogoLivros.adicionarLivro("Livro repete autor 1",
                "Autor 1", 2020);

        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1994);
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2025));


    }
}
