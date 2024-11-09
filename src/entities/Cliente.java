package entities;

import java.util.List;

public class Cliente extends Pessoa {
    private int numeroDeCliente;
    private List<String> preferencias;

//    List<String> preferencias = Arrays.asList("Vista para o mar", "Quarto silencioso");
//    Cliente cliente = new Cliente("Maria Souza", "987.654.321-00", "(11) 99876-5432", 56789, preferencias);
//    cliente.exibirInformacoes();

//    Cliente:
//    Nome: Maria Souza
//    CPF: 987.654.321-00
//    Telefone: (11) 99876-5432
//    Número do Cliente: 56789
//    Preferências: Vista para o mar, Quarto silencioso


    public Cliente(String nome, String cpf, String telefone, int numeroDeCliente, List<String> preferencias) {
        super(nome, cpf, telefone);
        this.numeroDeCliente = numeroDeCliente;
        this.preferencias = preferencias;
    }

    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }

    public void setNumeroDeCliente(int numeroDeCliente) {
        this.numeroDeCliente = numeroDeCliente;
    }

    public List<String> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<String> preferencias) {
        this.preferencias = preferencias;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Cliente:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Número do Cliente: " + numeroDeCliente);
        if (preferencias != null && !preferencias.isEmpty()) {
            System.out.println("Preferências: " + String.join(", ", preferencias));
        } else {
            System.out.println("Preferências: Nenhuma");
        }
    }
}
