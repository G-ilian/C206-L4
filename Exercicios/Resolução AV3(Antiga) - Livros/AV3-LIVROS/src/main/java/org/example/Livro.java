package org.example;

public class Livro implements Comparable<Livro>{
    // Atributos do Livro
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas; // Atributo que será levado em consideração para comparação

    // Métodos
    public void mostraInfo(){
        System.out.println("++++ INFOS DO LIVRO ++++");
        System.out.println("NOME: "+this.nome);
        System.out.println("AUTOR : "+this.autor);
        System.out.println("EDITORA : "+this.editora);
        System.out.println("QNT. PÁGINAS: "+this.qtdPaginas);
    }
    // Método sobescrito para comparação
    @Override
    public int compareTo(Livro livro) {
        return Integer.compare(this.qtdPaginas,livro.qtdPaginas); // COMPARAÇÃO
    }

    // Setters e getters que serão usados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
}
