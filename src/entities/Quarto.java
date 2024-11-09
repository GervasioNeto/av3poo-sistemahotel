package entities;

public abstract class Quarto {
    protected int numero;
    protected int capacidade;
    protected double precoDiaria;

    public Quarto(int numero, int capacidade, double precoDiaria) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoDiaria = precoDiaria;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public abstract double calcularPrecoFinal(int dias);

    public String toString() {
        return "Quarto [numero=" + numero + ", preco=" + precoDiaria + "]";
    }
}

