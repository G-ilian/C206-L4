public class Estante {
    // Atributos Explicitos
    char letra; // Letra que identifica a estante
    int idEstante; // Id da estante
    // Atributos Implicitos
    Livro [] livros = new Livro[120]; // Array de livros do moisés

    // Construtor da classe estante
    public Estante(char letra, int idEstante){
        this.letra=letra;
        this.idEstante=idEstante;
    }

    // Métodos da estante
        // 1. Método para adicionar livros na estante
    void addLivros(Livro livro){
        // Percorrendo o array de Livros
        for (int i = 0; i < livros.length; i++) {
            // Verificação se a posição está vazia
            if(livros[i]==null){
                livros[i]=livro; // Adicionando o livro ao array
                break; // Parando a sobreposição
            }
        }
    }

    void porcentagemGen(){
        // Variáveis locais para contagem da quantidade de livro de cada genero
        int contaDrama = 0; // Variável de contagem de livros de drama
        int contaSuspense = 0; // Variável de contagem de livros de suspense
        int contaOutros = 0; // Variável de contagem de livros de outro generos
        int qtdLivrosEstante = 0; // Armazena a quantidade livros na estante

        // Percorrendo o array de livros
        for (int i = 0; i < livros.length; i++) {
            // Verificando se existe um livro na posição i
            if(livros[i]!=null){
                // Verificando o gen Literário dos livros
                if(livros[i].genLiterario.equalsIgnoreCase("Drama"))
                    contaDrama++;// Incrementei contador de drama
                else if(livros[i].genLiterario.equalsIgnoreCase("Suspense"))
                    contaSuspense++; // Incrementei contador de suspense
                else
                    contaOutros++; // Incrementando contador de outros generos

                qtdLivrosEstante++; // Incrementando a contagem de livros
            }
        }

        // Apresentando as informações relativas a porcentagem de livros da estante
        System.out.println("Porcentagem de livros de cada Genero");
        System.out.println("Drama: "+((double)contaDrama/qtdLivrosEstante)*100+" %");
        System.out.println("Suspense: "+((double)contaSuspense/qtdLivrosEstante)*100+" %");
        System.out.println("Outros: "+((double)contaOutros/qtdLivrosEstante)*100+" %");
    }
    void livroMaisEMenosPag(){
        // Variáveis locais para controle de fluxo
        int maiorNumPags = 0; // Armazena o maior número de páginas
        int menorNumPags = 9999; // Armazena o menor número de páginas
        int posMaior=0; // Armazena a posição onde está o livro com mais páginas
        int posMenor=0; // Armazena a posição onde está o livro com menos páginas

        for (int i = 0; i < livros.length; i++) {
            if(livros[i]!=null) {
                if (livros[i].qtdFolhas > maiorNumPags) {
                    posMaior = i; // Coletando a posição do livro com mais páginas
                    maiorNumPags = livros[i].qtdFolhas; // Atribuindo a variavel o valor de páginas do livro
                }
                if (livros[i].qtdFolhas < menorNumPags) {
                    posMenor = i;
                    menorNumPags = livros[i].qtdFolhas;
                }
            }
        }

        // Mostrando informações
        if(posMaior==0 && posMenor==0){
            System.out.println("Não há informações de livros cadastrados");
        }else{
            // Apresentando as informações dos livros
            System.out.println("Livros mais páginas");
            livros[posMaior].mostrarInfos();
            System.out.println("Livro menos páginas");
            livros[posMenor].mostrarInfos();
        }

    }

        // 4. Método para apresentar informações dos livros e da estante
    void mostrarInfos(){
        System.out.println("LETRA: "+letra);
        System.out.println("ID: "+idEstante);
        System.out.println("INFOS DO LIVRO ");
        for (int i = 0; i < livros.length; i++) {
            if(livros[i]!=null){
                livros[i].mostrarInfos();
            }
        }
    }
}
