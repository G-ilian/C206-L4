public class Funcionario implements Comparable<Funcionario>{
    // Atributos do funcionário
    private String nome;
    private int idade;
    private float salario;

    // Construtor

    public Funcionario(String nome, int idade,float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Getters para a classe

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getSalario() {
        return salario;
    }

    // Método que servirá para realizar as comparações
    @Override
    public int compareTo(Funcionario func) {
        return Float.compare(this.salario,func.getSalario());
    }
}
