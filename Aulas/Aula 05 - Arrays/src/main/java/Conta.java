public class Conta {
    // Atributos da conta
    float saldoDaConta; // Saldo da conta
    String numConta; // Número da conta

    // Titular agregado a conta
    Titular []titular=new Titular[2];

    // Construtor da classe
    public Conta(float saldoDaConta, String numero){
        System.out.println("++++ CONTA CRIADA +++++");
        this.saldoDaConta=saldoDaConta;
        this.numConta=numero;
    }
    // Método para mostrar as informações
    void mostraInfos(){
        System.out.println("Informações da conta");
        System.out.println("Saldo: "+this.saldoDaConta);
        System.out.println("Número da conta: "+this.numConta);
    }

    // Adicionando titulares na conta
    void addTitular(Titular novoTitular){
        // Percorrendo as posicoes do array
        for (int i = 0; i < titular.length; i++) {
            if(titular[i]==null){
                titular[i]=novoTitular; // Adicionei um titular a uma posição vazia
                break;
            }

        }
    }
}
