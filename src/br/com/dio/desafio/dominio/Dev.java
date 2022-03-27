package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<conteudo> conteudoInscrito= new LinkedHashSet<>();
    private Set<conteudo> conteudoconcluido = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp){
        this.conteudoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }



    public void progredir(){
        Optional<conteudo>conteudo =this.conteudoInscrito.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudoconcluido.add(conteudo.get());
            this.conteudoInscrito.remove(conteudo.get());

        }else{
            System.err.println("voce nao esta matriculado no bootcamp");
        }
    }


    public double calcularTotalXP(){
        return this.conteudoconcluido

                .stream()
                .mapToDouble(conteudo::calcularXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudoInscrito() {
        return conteudoInscrito;
    }

    public void setConteudoInscrito(Set<conteudo> conteudoInscrito) {
        this.conteudoInscrito = conteudoInscrito;
    }

    public Set<conteudo> getConteudoconcluido() {
        return conteudoconcluido;
    }

    public void setConteudoconcluido(Set<conteudo> conteudoconcluido) {
        this.conteudoconcluido = conteudoconcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscrito, dev.conteudoInscrito) && Objects.equals(conteudoconcluido, dev.conteudoconcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscrito, conteudoconcluido);
    }

}
