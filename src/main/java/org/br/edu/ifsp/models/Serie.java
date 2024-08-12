package org.br.edu.ifsp.models;

public class Serie  extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nome, boolean incluidoNoPlano, int anoDeLancamento, int temporadas, boolean ativa, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nome, incluidoNoPlano, anoDeLancamento);
        this.temporadas = temporadas;
        this.ativa = ativa;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    public int getDuracaoEmMinutos(){
        return this.getTemporadas() * this.getEpisodiosPorTemporada() * this.getMinutosPorEpisodio();
    }
}
