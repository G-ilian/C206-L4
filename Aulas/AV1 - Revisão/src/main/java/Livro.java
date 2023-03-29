public class Livro {
    // Atributos do livro - Explicito
    String genLiterario; // Genero literário do livro
    String editora;// Editora do livro
    String titulo;// Titulo do livro
    int qtdFolhas;// Quantidade de páginas do livro

    // Atributos do livro - Implicito
    Autor autor; // Referência para o meu autor

    // Construtor da classe Livro
    public Livro() {
        this.autor = new Autor(); // Finalizada a composição entre livro e autor
    }

    // Métodos da classe de Livro
    void mostrarInfos(){
        System.out.println("==== Infos do livro ====");
        System.out.println("Titulo: "+titulo);
        System.out.println("Editora: "+editora);
        System.out.println("Gen. Literário: "+genLiterario);
        System.out.println("Quantidade de folhas: "+qtdFolhas);
        // Mostrando as informações do autor
        autor.mostrarInfos();
    }

}
