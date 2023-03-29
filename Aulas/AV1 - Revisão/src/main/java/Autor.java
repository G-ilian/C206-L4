public class Autor {
    // Atributos da minha classe
    String nome; // Nome do autor
    String profissao;// Profissão do Autor
    int anoNascimento; // Ano de nascimento do autor

    // Métodos da classe
    void mostrarInfos(){
        System.out.println("==== INFOS DO AUTOR ====");
        System.out.println("Nome: "+this.nome);
        System.out.println("Profissão: "+this.profissao);
        System.out.println("Ano de nascimento: "+this.anoNascimento);
    }
}
