package exercicio;

public class Escola {
    // Atributos da escola
    String nome;
    String endereco;
    String numTelefone;
    String email;
    // Atributo implicito de escola
    Estudante [] estudantes = new Estudante[300];

    // Construtor da escola
    public Escola(String nome, String endereco, String numTelefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.numTelefone = numTelefone;
        this.email = email;
    }

    // Métodos da classe Escola
    void addEstudante(Estudante e){
        // Percorrendo o array
        for (int i = 0; i < estudantes.length; i++) {
            // Verificar se a i-ésima posição está vazia
            if(estudantes[i]==null){
                estudantes[i]=e;
                break;
            }
        }
    }

    void mostrarInfos(){
        System.out.println("INFOS DA ESCOLA");
        System.out.println("Nome: "+this.nome);
        System.out.println("Endereço: "+this.endereco);
        System.out.println("email: "+this.email);
        System.out.println("Número: "+this.numTelefone);
        // Percorrendo o array
        for (int i = 0; i < estudantes.length; i++) {
            // Verificar se a i-ésima posição está cheia
            if(estudantes[i]!=null){
                estudantes[i].mostrarInfos();
            }
        }
    }

    void qtdEstudanteAno(){
        // Contadores por ano
        int primeiroAno=0;
        int segundoAno=0;
        int terceiroAno=0;
        // Percorrendo o array
        for (int i = 0; i < estudantes.length; i++) {
            // Verificar se a i-ésima posição está cheia
            if(estudantes[i]!=null){
                if(estudantes[i].ano.equalsIgnoreCase("Primeiro")){
                    primeiroAno++;
                }else if(estudantes[i].ano.equalsIgnoreCase("Segundo")){
                    segundoAno++;
                }else{
                    terceiroAno++;
                }
            }
        }

        System.out.println("Quantidade de alunos por ano");
        System.out.println("1º ANO: "+primeiroAno);
        System.out.println("2º ANO: "+segundoAno);
        System.out.println("3º ANO: "+terceiroAno);


    }
}
