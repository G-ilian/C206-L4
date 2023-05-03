public class Conta {
    // Atributos da conta
    private int numConta;
    private double saldo;

    public Conta(int numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // Métodos da conta
    public void sacar(double valorSaque) throws SemSaldoException{
        // Tratamento do erro

        // Verifica se o valor do saque é menor que o valor do saldo
        if(valorSaque>this.saldo){
                // Lança uma exceção personalizada
                throw new SemSaldoException(this.saldo,valorSaque);
        }else{
            this.saldo -=valorSaque;
            System.out.println("NOVO SALDO: "+this.saldo+" R$");
        }
    }
}
