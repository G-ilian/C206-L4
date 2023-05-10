package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um Arquivo
        Arquivo arq = new Arquivo();

        // Apresentando as informações dos funcionários
        ArrayList<Funcionario> funcionariosEncontrados;

        // Criando um menu para deixar a aplicação dinâmica

        // Controladora do while
        boolean flag = true;

        // Opção de escolha do usuário
        int opcao;

        // Entrada e saída de dados
        Scanner sc = new Scanner(System.in);

        while(flag){
            funcionariosEncontrados = arq.lerArquivos();

            System.out.println("+++++++++++ BEM VINDO(A) AO MENU");
            System.out.println("1- CADASTRAR FUNCIONÁRIO");
            System.out.println("2- LISTAR OS FUNCIONÁRIOS");
            System.out.println("3- SAIR DA APLICAÇÃO");
            opcao = sc.nextInt(); // Entrando com a opção do usuário
            sc.nextLine(); // Limpando o buffer

            switch (opcao){
                case 1:
                    // Adicionando um funcionário no Arquivo
                    String nome;
                    double salario;
                    int idade;

                    System.out.println("Nome: ");
                    nome = sc.nextLine();

                    System.out.println("Salário: ");
                    salario = sc.nextDouble();

                    System.out.println("Idade: ");
                    idade = sc.nextInt();

                    // Criando o funcionário
                    Funcionario func = new Funcionario(nome,salario,idade);

                    // Escrevendo as informações deste funcionário dentro do arquivo
                    arq.escreverArquivo(func);
                    break;
                case 2:
                    // Apresentando as informações dos funcionários
                    for (int i = 0; i < funcionariosEncontrados.size(); i++) {
                        System.out.println("NOME: "+funcionariosEncontrados.get(i).getNome());
                        System.out.println("SALÁRIO: "+funcionariosEncontrados.get(i).getSalario());
                        System.out.println("IDADE: "+funcionariosEncontrados.get(i).getIdade());
                    }
                    break;
                case 3:
                    flag = false;
                    break;
            }
        }

        sc.close(); // Fechando a entrada de dados

    }
}