package br.inatel.predio6.aulaModificadoresDeAcesso;

public class Funcionario {
    // Criando um id único para o funcionário
    private String nome; // Nome do funcionário
    private static int contaFuncionarios = 0; // Acesso modificado para privado
    public int id; // Id pública - Qualquer parte do nosso código possui acesso

    // Construtor da classe
    public Funcionario(){
        contaFuncionarios++; // Incrementando o atributo estático
        this.id = contaFuncionarios; // Armazenando o valor incremental nos funcionários
    }

    // Métodos
    public void mostrarInfos(){
        System.out.println("+++++ INFOS DO FUNCIONÁRIO +++++");
        System.out.println("Nome: "+this.nome);
        System.out.println("ID: "+this.id);
    }

    // Criando Getters and Setters
    // Getter -> Permite você recuperar um dado(recurso)
    // Setter -> Permite você mudar um dado(recurso)

    // Getter
    public static int getContaFuncionarios() {
        if(contaFuncionarios==0){
            System.out.println("Não há funcionários cadastrados");
        }
        return contaFuncionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
