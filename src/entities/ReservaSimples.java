package entities;

import interfaces.Cancelavel;
import interfaces.Descontavel;
import interfaces.Reservavel;

public class ReservaSimples extends Reserva implements Cancelavel, Descontavel, Reservavel {

    public ReservaSimples(Cliente cliente, Quarto quarto, int diasReservados) {
        super(cliente, quarto, diasReservados);
    }

    @Override
    public void processarReserva() {
        System.out.println("Reserva processada para " + cliente.getNome());
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada para " + cliente.getNome());
    }

    @Override
    public void confirmarCancelamento() {
        System.out.println("Cancelamento confirmado para " + cliente.getNome());
    }

    public double calcularPreco() {
        return quarto.getPrecoDiaria() * diasReservados;
    }

    @Override
    public double aplicarDesconto(double desconto) {
        double precoSemDesconto = calcularPreco();
        return precoSemDesconto - (precoSemDesconto * (desconto / 100));
    }

    @Override
    public boolean reservar() {
        return false;
    }
}
