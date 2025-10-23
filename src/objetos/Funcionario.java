package objetos;

public class Funcionario {
    private double salario;
    private String nome;

    public Funcionario(String nome, double salario) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome precisa existir para funcionário!");
        }
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero!");
        }
        this.nome = nome;
        this.salario = salario;
    }
    public void aumentarSalario(double porcentagem) {
        if (porcentagem > 0) {
            salario += salario * (porcentagem / 100);
        } else {
            System.out.println("O aumento não pode ser negativo nem zero!");
        }
    }
    public void exibir() {
        System.out.println("Nome: " + nome + " | Salário: R$" + salario);
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }
} 