public abstract class Funcionario2 {
    // Atributos do funcionário
    private String nome; // Nome
    private int anoNascimento; // Ano de nascimento

    // Método genérico para mostrar informações dos funcionários
    public void mostrarInfos(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Ano nascimento: "+this.anoNascimento);
    }

    // Métodos do funcionário
    public abstract void executaAcao();

    // Getters and setters da nossa classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
}