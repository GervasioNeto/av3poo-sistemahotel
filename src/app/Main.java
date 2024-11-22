package app;

import entities.Cliente;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> preferenciasC1 = Arrays.asList("Vista para o mar", "Quarto silencioso");
        Cliente c1 = new Cliente("Maria Souza", "987.654.321-00", "(11) 99876-5432", 56789, preferenciasC1);
        c1.exibirInformacoes();
    }
}
