package main.java.Set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int num) {
        this.contatos.add(new Contato(nome, num));
    }

    public void exibirContatos() {
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosApesquisar = new HashSet<Contato>();

        for(Contato c : this.contatos) {
            if(c.getNome().startsWith(nome)){
                contatosApesquisar.add(c);
            }
        }

        return contatosApesquisar;
    }

    public Contato  atualizarNumeroContato(String nome, int num) {
        Contato contatoAtulizado = null;

        for(Contato c : this.contatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(num);
                contatoAtulizado = c;
                break;
            }
        }

        return contatoAtulizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Lorenzo" , 1);
        agenda.adicionarContato("Lorenzo" , 2);
        agenda.adicionarContato("Lorenzo Java" , 2);
        agenda.adicionarContato("Lorenzo Dio" , 5);
        agenda.adicionarContato("Bernardo" , 3);
        agenda.adicionarContato("Theo" , 3);
        agenda.adicionarContato("Maria" , 10001);

        //agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome( "Lorenzo" ));

    }
}
