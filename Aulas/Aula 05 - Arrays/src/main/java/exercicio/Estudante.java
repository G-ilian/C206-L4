package exercicio;

public class Estudante {
    // Atributos do estudante
    String nome;
    int idade;
    String ano;

    // Criando construtor
    public Estudante(String nome, int idade,String ano) {
        this.nome = nome;
        this.idade = idade;
        this.ano=ano;
    }

    // Métodos do estudante
    void mostrarInfos(){
        System.out.println("INFOS DO ALUNO");
        System.out.println("NOME: "+this.nome);
        System.out.println("IDADE: "+this.idade);
        System.out.println("ANO: "+this.ano);
    }
}
