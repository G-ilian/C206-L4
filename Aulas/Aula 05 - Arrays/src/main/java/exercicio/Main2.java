package exercicio;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // Criando entrada de dados
        Scanner sc = new Scanner(System.in);

        Escola escola = new Escola("Escola do Paulo",
                "Rua da sorte", "50",
                "pauloEscola@escola.br"); // Instanciando escola

        boolean flag = true; // Flag de controle do while

        while (flag) {
            System.out.println("--- BEM VINDO " + escola.nome + " ---");
            System.out.println("1 - Cadastrar estudantes");
            System.out.println("2 - Mostrar as informações dos estudantes");
            System.out.println("3 - Mostrar quantidade de estudantes por ano");
            System.out.println("4 - Sair do sistema");

            int opcao = sc.nextInt(); // Atribuindo a entrada de dados a variável opção
            sc.nextLine();

            switch (opcao) {
                case 1:
                    // Criando o estudante que será adicionado no array de estudantes
                    System.out.println("Nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Idade do aluno: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ano letivo do aluno: ");
                    String anoLetivo = sc.nextLine();

                    // Criando um estudante
                    Estudante e = new Estudante(nome, idade, anoLetivo);

                    // Adicionando estudante criado na escola
                    escola.addEstudante(e);
                    break;

                case 2:
                    escola.mostrarInfos(); // Mostrando as informações da escola e dos estudantes
                    break;
                case 3:
                    escola.qtdEstudanteAno();// Quantidade de aluno por ano letivo
                    break;
                case 4:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida !!");
                    break;
            }

        }
        sc.close();// Fechando entrade de dados
    }
}