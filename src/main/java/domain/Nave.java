package domain;

import util.RecursosEnum;

import java.util.ArrayList;
import java.util.List;

public class Nave {
    private int combustivel;
    private int posicao;
    private List<RecursosEnum> recursos = new ArrayList<>();

    public Nave(int combustivel) {
        this.combustivel = combustivel;
        this.posicao = 0;
    }

    public void explorar(Planeta planeta) {
        int qttdCombustivelPlaneta = planeta.getPosicao() * 3;
        if (qttdCombustivelPlaneta < combustivel) {
            combustivel = combustivel - qttdCombustivelPlaneta;
            posicao = planeta.getPosicao();
            recursos.addAll(planeta.getRecursos());
            if (qttdCombustivelPlaneta < combustivel) {
                combustivel = combustivel - qttdCombustivelPlaneta;
                posicao = 0;
            } else {
                int qttdPosicaoComb = combustivel / 3;
                posicao = posicao - qttdPosicaoComb;
            }
        } else {
            int qttdPosicaoComb = combustivel / 3;
            posicao = posicao + qttdPosicaoComb;
        }
    }
    public int getPosicao() {
        return posicao;
    }

}
