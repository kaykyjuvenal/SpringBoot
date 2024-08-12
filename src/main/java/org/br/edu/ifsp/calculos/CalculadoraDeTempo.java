package org.br.edu.ifsp.calculos;

import org.br.edu.ifsp.models.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui (Filme filme ){
        this.tempoTotal += filme.getDuracaoEmMinutos();
    }

}
