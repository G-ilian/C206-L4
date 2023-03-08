import java.security.spec.RSAOtherPrimeInfo;

public class Funcionario {
    // Caracteristicas do funcionário - Atributos
    String nome;
    String cpf;
    int idade;
    double salario;

    // Ações que um Funcionário pode ter - Métodos
    // Métodos void não possuem retorno

    void tirarFerias(String mesFerias, int qtdDias){
        System.out.println("O funcionário(a): "+nome+" " +
                "tirou férias,em "+mesFerias+" por "+qtdDias+" dias");
    }

    double calcularSalarioAnual(){
        double salarioAnual;
        salarioAnual = 12*salario;
        return salarioAnual;

    }

    double calcularSalarioAnual(double decimoTerceiro){
        double salarioAnual;
        salarioAnual = (12*salario)+decimoTerceiro;
        return salarioAnual;

    }

    void mostrarInfos(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
        System.out.println("CPF: "+cpf);
    }

}
