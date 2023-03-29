import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Controla entrada de dados
        Scanner sc = new Scanner(System.in);

        // Variáveis e objetos importantes do sistema
        Estante estante = new Estante('A',1); // Criando estante
        boolean flag = true; // Controladora While
        int opcao=0; // Opção do menu

        while(flag){
            System.out.println("BEM VINDO AO SISTEMA DE CONTROLE DE LIVROS");
            System.out.println("1- Adicionar Livros");
            System.out.println("2 - Mostrar porcentagem de livros de cada gen");
            System.out.println("3 - Mostrar livro com mais e menos páginas");
            System.out.println("4 - Mostrar infos dos livros cadastrados");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpando o buffer
            switch (opcao){
                case 1:
                    // Criando Livro na Main
                    Livro livro = new Livro();
                    System.out.println("Titulo: ");
                    livro.titulo = sc.nextLine();
                    System.out.println("Genero Literário: ");
                    livro.genLiterario=sc.nextLine();
                    System.out.println("Editora: ");
                    livro.editora=sc.nextLine();
                    System.out.println("Quantidade de páginas");
                    livro.qtdFolhas = sc.nextInt();
                    sc.nextLine(); // Limpando o buffer
                    // Acessando e preenchendo as infos do autor
                    System.out.println("Nome do autor: ");
                    livro.autor.nome=sc.nextLine();
                    System.out.println("Profissao: ");
                    livro.autor.profissao = sc.nextLine();
                    System.out.println("Ano de nascimento: ");
                    livro.autor.anoNascimento=sc.nextInt();
                    // Adicionando livros a estante
                    estante.addLivros(livro);
                    break;
                case 2:
                    estante.porcentagemGen();
                    break;
                case 3:
                    estante.livroMaisEMenosPag();
                    break;
                case 4:
                    estante.mostrarInfos();
                    break;
                default:
                    flag = false; // Saindo do menu
                    break;
            }

        }
        sc.close(); // Fechando a entrada de dados
    }
}
