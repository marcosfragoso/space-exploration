package util;

public enum RecursosEnum {
    AGUA(180, 10),
    OXIGENIO(300, 2),
    SILICIO(60, 16),
    OURO(120, 25),
    FERRO(30, 32);

    private int valor;
    private int peso;

    RecursosEnum(int valor, int peso) {
        this.valor = valor;
        this.peso = peso;
    }

    public int getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }
}
