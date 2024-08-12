package org.br.edu.ifsp.calculos;

public class FiltroRecomendacao {
    ;

    public String filtro(Classificavel classificavel){
        String mensagem;
        if (classificavel.getClassificacao() >= 4){
            mensagem = "Esta entre os preferidos do momento!";
        } else if (classificavel.getClassificacao() >= 2) {
            mensagem = "Muito bem avaliado no momento";
        }
        else {
            mensagem = "Coloque na sua lista para assistir depois!";
        }
        return mensagem;
    }

}
