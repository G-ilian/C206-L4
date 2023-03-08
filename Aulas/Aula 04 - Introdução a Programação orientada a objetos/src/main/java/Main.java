import java.util.Scanner; // Import da classe Scanner

public class Main {
    public static void main(String[] args) {
        // Instanciando/Criar um funcionário
        Funcionario func=new Funcionario();

        // Atribuição de variáveis de forma dinâmica
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do funcionário(a): ");
        func.nome = sc.nextLine();

        System.out.println("CPF do funcionário(a): ");
        func.cpf = sc.nextLine();
        System.out.println("Idade do funcionário(a): ");
        func.idade = sc.nextInt();
        System.out.println("Salário do funcionário(a): ");
        func.salario = sc.nextDouble();

        func.mostrarInfos();
        double salarioAno= func.calcularSalarioAnual();
        double salarioAnoDecimo= func.calcularSalarioAnual(2000);
        func.tirarFerias("Dezembro",15);
        System.out.println("Salário anual: "+salarioAno);
        System.out.println("Salário anual+ 13°: "+salarioAnoDecimo);


        sc.close(); // Fechando entrada de dados

    }
}
