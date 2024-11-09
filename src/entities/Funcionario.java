package entities;

public class Funcionario extends Pessoa {
    protected int matricula;
    protected double salario;

    public Funcionario(String nome, String cpf, String telefone, int matricula, double salario) {
        super(nome, cpf, telefone);
        this.matricula = matricula;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Funcionário:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matrícula: " + matricula);
        System.out.println("Salário: R$ " + salario);
    }
}


