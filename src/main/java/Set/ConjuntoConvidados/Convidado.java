package main.java.Set.ConjuntoConvidados;

import java.util.Objects;

public class Convidado {
    private String name;
    private int codigoConvite;

    public Convidado(String name, int codigoConvite) {
        this.name = name;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "name='" + name + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }
}
