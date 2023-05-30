package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um arquivo
        Arquivo arq=new Arquivo();
        // Criando um Livro
        Livro livro=new Livro();
        // Entrada de dados
        Scanner sc=new Scanner(System.in);
        // Flag de controle do while
        boolean flag=true;

        while(flag){
            // ArrayList auxiliar com os livros - retorno a partir do método de leitura
            ArrayList<Livro> livros=arq.ler();

            System.out.println("BEM VINDO AO MENU");
            System.out.println("1- Cadastrar Livro");
            System.out.println("2- Listar Livros");
            System.out.println("3 - Ordenar Livros em ordem crescente (Páginas)");
            System.out.println("4 - Ordenar Livros em ordem de crescente (Páginas)");
            System.out.println("5- Sair");
            System.out.println("Entre com a sua opção: ");

            int opcao=sc.nextInt(); // Entrada de opção do usuário
            sc.nextLine(); // Limpando o buffer

            if(livros.size()==0){
                System.out.println("Não existem livros cadastrados ainda");
            }
            switch (opcao){
                case 1:
                    System.out.println(" ADICIONANDO UM LIVRO ....");
                    System.out.println("Nome: ");
                    livro.setNome(sc.nextLine());
                    System.out.println("Autor: ");
                    livro.setAutor(sc.nextLine());
                    try{
                        System.out.println("Editora: ");
                        livro.setEditora(sc.nextLine());
                        // Verificando o digitado para as editoras
                        if(!(livro.getEditora().equalsIgnoreCase("Leya")
                                || livro.getEditora().equalsIgnoreCase("Arqueiro")||
                                livro.getEditora().equalsIgnoreCase("Rocco"))){
                            throw new InfoInvalidaException("SELECIONE UMA DAS TRÊS EDITORAS\n LEYA - ARQUEIRO - ROCCO"); // Lançando a exceção
                        }
                        System.out.println("Número de páginas: ");
                        livro.setQtdPaginas(sc.nextInt());
                        // Verificando a quantidade de páginas do livro
                        if(livro.getQtdPaginas()<=0){
                            throw new InfoInvalidaException("A quantidade de páginas do livro não pode ser menor que 0");
                        }
                    }catch (InfoInvalidaException info){
                        System.out.println(info);
                        break; // Para a execução e não permite o cadastro do livro
                    }

                    arq.escrever(livro); // Salvando no arquivo o livro
                    break;
                case 2:
                    // Percorrendo o arrayList de livros e mostrando as informações
                    for(int i=0;i<livros.size();i++){
                        livros.get(i).mostraInfo();
                    }
                    break;
                case 3:
                    Collections.sort(livros); // Ordenando os livros em ordem crescente
                    // Mostrando as informações do livro em ordem crescente
                    for(int i=0;i<livros.size();i++){
                        livros.get(i).mostraInfo();
                    }
                    break;
                case 4:
                    Collections.sort(livros); // Ordenando os livros em ordem crescente
                    Collections.reverse(livros); // Revertendo a ordem de ordenação, logo em ordem decrescente
                    // Mostrando as informações do livro em ordem decrescente
                    for(int i=0;i<livros.size();i++){
                        livros.get(i).mostraInfo();
                    }
                    break;
                case 5:
                    flag=false;
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA !!!!");
                    break;

            }
        }

        sc.close(); // Fechando a entrada de dados


    }
}