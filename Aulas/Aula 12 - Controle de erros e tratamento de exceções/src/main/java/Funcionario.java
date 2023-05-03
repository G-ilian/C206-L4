public class Funcionario {
    // Atributos do Funcionario
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    // Criando os getters para as informações do Funcionario

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
