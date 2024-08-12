package org.br.edu.ifsp.models;

import org.br.edu.ifsp.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    private int avaliacao;
    private int duracaoEmMinutos;
    int somaAvaliacao;
    int totalAvaliacoes;

    public Filme(String nome, boolean incluidoNoPlano, int anoDeLancamento, String diretor, int avaliacao) {
        super(nome, incluidoNoPlano, anoDeLancamento);
        this.diretor = diretor;
        this.avaliacao = avaliacao;
    }

    public Filme(String nome, boolean incluidoNoPlano, int anoDeLancamento) {
        super(nome, incluidoNoPlano, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void avaliar(int avaliacao) {
        this.setAvaliacao(this.getAvaliacao() + avaliacao);
        totalAvaliacoes ++;
    }
    public double calcularMediaAvaliacao() {
        return (double) somaAvaliacao / totalAvaliacoes;
    }

    @Override
    public int getClassificacao() {

        return this.getAvaliacao();
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
