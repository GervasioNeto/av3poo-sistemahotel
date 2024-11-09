package entities;

public abstract class Reserva {
    protected Cliente cliente;
    protected Quarto quarto;
    protected int diasReservados;

    public Reserva(Cliente cliente, Quarto quarto, int diasReservados) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.diasReservados = diasReservados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public int getDiasReservados() {
        return diasReservados;
    }

    public abstract void processarReserva();

    @Override
    public String toString() {
        return "Reserva{" +
                "cliente=" + cliente +
                ", quarto=" + quarto +
                ", diasReservados=" + diasReservados +
                '}';
    }
}
