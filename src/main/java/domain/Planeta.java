package domain;

import util.RecursosEnum;

import java.util.List;

public class Planeta {
    private int posicao;
    private List<RecursosEnum> recursos;

    public Planeta(int posicao, List<RecursosEnum> recursos) {
        this.posicao = posicao;
        this.recursos = recursos;
    }

    public int getTotal(){
        int valorTotal = 0;
        for (RecursosEnum recurso : recursos) {
            valorTotal = valorTotal + recurso.getValor();
        }
        return valorTotal;
    }
    public int getValorPorPeso(){
        int valorTotal = 0;
        for (RecursosEnum recurso : recursos) {
            valorTotal = valorTotal + (recurso.getValor()/ recurso.getPeso());
        }
        return valorTotal;
    }

    public int getPosicao() {
        return posicao;
    }

    public List<RecursosEnum> getRecursos() {
        return recursos;
    }

}
