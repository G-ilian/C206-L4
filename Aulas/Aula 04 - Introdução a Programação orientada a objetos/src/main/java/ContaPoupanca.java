public class ContaPoupanca {
    // Atributos da conta poupança
    String nomeTitular; // Nome do titular da conta
    String numConta; // Número da conta
    double saldo; // Saldo da conta

    // Métodos
    void verificarSaldo(){
        System.out.println("Saldo: "+saldo+" R$");
    }

    void mostrarInfos(){
        System.out.println("Titular: "+nomeTitular);
        System.out.println("Nº Conta: "+numConta);
    }
}
