package org.example;

public class Funcionario {
    // Atributos do funcionário
    private String nome;
    private double salario;
    private int idade;

    // Construtor

    public Funcionario(String nome, double salario, int idade) {
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
    }

    // Criando os getters

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }
}
