import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ++++ EXCEÇÕES PERSONALIZADAS ++++
        Conta c1 = new Conta(1020,16000);

        try{
            c1.sacar(19000);

        }catch (SemSaldoException s){
            System.out.println("Não deu pra sacar");
            System.out.println(s);
        }
        System.out.println("CONTINUA RODANDO !!!!");
        /*
        // Entrada de dados
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int num3 = 0;

        // Tratamento de erros
        try{
            // Entrando com dois valores de forma estática
            System.out.println("Entre com o primeiro número: ");
            num1 = sc.nextInt();
            sc.nextLine(); // Limpando o buffer
            System.out.println("Entre com o segundo número: ");
            num2 = sc.nextInt();
            num3 = num1/num2;

        }catch(ArithmeticException e){
            System.out.println("Houve um erro no valor do segundo numero");
            System.out.println("Entre com um valor diferente de 0");
            System.out.println(e.getCause());
        }catch (InputMismatchException i){
            System.out.println("O tipo do dado é inteiro !!");
            System.out.println("Digite um valor do tipo inteiro !!!");

        }finally{
            // Divisão dos dois valores
            if(num3==0){
                System.out.println("Deu ruim na divisão !!!");
            }else{
                System.out.println(num3);
            }

        }

        sc.close(); // Fechando a entrada de dados

        ++++++++ NULLPOINTEREXCEPTION
        // Array Convencional de Funcionarios
        Funcionario [] funcionarios = new Funcionario[10];

        // Instanciando dois objetos do tipo Funcionário
        Funcionario func1 = new Funcionario("Gabriel",1200);
        Funcionario func2 = new Funcionario("Thiago",1200);

        // Adicionando os funcionários nas primeiras posições do meu array
        funcionarios[0] = func1;
        funcionarios[1] = func2;

        // Fazendo a coleta da exceção
        try{
            // Trecho de código que pode vir a lançar uma exceção
            // Percorrer o array
            for (int i = 0; i < funcionarios.length; i++) {
                System.out.println("NOME: "+funcionarios[i].getNome());
                System.out.println("SALÁRIO: "+funcionarios[i].getSalario());
            }
        }catch(NullPointerException e){
            System.out.println(e);
        }


        System.out.println("Continua rodando????? ");

    */
    }


}
