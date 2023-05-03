public class SemSaldoException extends Exception{
    public SemSaldoException(double saldo, double saque){
        System.out.println("NÃO FOI POSSIVEL REALIZAR A OPERAÇÃO");
        System.out.println("Seu saldo é menor que o valor de saque");
        System.out.println(saldo +"< "+saque);

    }
}
