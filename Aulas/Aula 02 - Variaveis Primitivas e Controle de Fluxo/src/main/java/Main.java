import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrada de valores
        Scanner sc = new Scanner(System.in);




        /*
        System.out.println("Entre com um  inteiro: ");
        int valorInteiro = sc.nextInt();
        System.out.println("Entre com um double: ");
        double valorDouble = sc.nextDouble();
        System.out.println("Entre com um float: ");
        float valorFloat = sc.nextFloat();
        sc.nextLine(); // Responsável por fazer a limpeza do buffer
        System.out.println("Entre com o seu nome: ");
        String nomeUsuario = sc.nextLine();


        // Impressão de dados
        System.out.println("Inteiro: "+valorInteiro);
        System.out.println("Double: "+valorDouble);
        System.out.println("Float: "+valorFloat);
        System.out.println("Nome do usuário: "+nomeUsuario);

        char letra; // Letra que queremos guardar
        String palavra; // Palavra que vamos obter do usuário

        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        letra = palavra.charAt(2);

        System.out.println("Palavra Maiscula: "+palavra.toUpperCase());
        System.out.println("Primeira letra da palavra: "+letra);


        // Variáveis primitivas

        int a=0; // Declaração de uma var inteira
        int e=0; // Nova váriave inteira

        float b = 2.9f; // Declaração de uma var real
        double c = 2.9; // Declaração de uma var real
        char d ='a'; // Declaração de uma var literal

        final int VALOR_PASSAGEM = 5; // Declarando uma var Constante

        // Realizando casting
        double numDouble=9.9; // Armazena números de ponto flutuante
        int numInteiro; // Armazena números inteiros

        // Transformar um número double em um float
        numInteiro = (int)numDouble;
        System.out.println("Número convertido: "+numInteiro);

        int primeiroInteiro = 5;
        int segundoInteiro = 2;

        System.out.println("Resultado da divisão: "+(double)primeiroInteiro/segundoInteiro);

        // Imprimindo os valores das variáveis primitivas
        System.out.println("Variável inteira: "+a);
        System.out.println("Float: "+b);
        System.out.println("Char: "+d);

        // Variáveis de referência
        String nomeSobrenome = "Gabriel Ilian";

        System.out.println("Meu nome é : "+nomeSobrenome);


        // Controle de fluxo
        int numeroUm;
        int numeroDois;

        System.out.println("Entre com o primeiro Número");
        numeroUm = sc.nextInt();
        System.out.println("Entre com o segundo Número");
        numeroDois = sc.nextInt();

        // Controle de fluxo
        if(numeroUm > numeroDois){
            System.out.println("1 é maior que 2");
        }else if(numeroDois> numeroUm){
            System.out.println("2 é maior que 1");
        }else{
            System.out.println("São iguais");
        }

         // Controle de fluxo com associação de variáveis
        float media = 65;
        float freq =0.75f;

        if(media>=60 && freq>=0.75){
            System.out.println("Aluno aprovado");
        }else if(media<30 && freq<0.75){
            System.out.println("Aluno reprovado");
        }else{
            System.out.println("Aluno de NP3 !!!");
        }

        // Estrutura condicional - Switch Case

        System.out.println("Média Alunos");
        System.out.println("A- Excelente, B - Bom, C - Ruim");

        String aux =sc.nextLine(); // Entrando com a média do aluno

        char nota = aux.toUpperCase().charAt(0);

        switch(nota){
            case 'A':
                System.out.println("Aprovado");
                break;
            case 'B':
                System.out.println("Recuperação");
                break;
            case 'C':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
                  // Estruturas de repetição

        // WHILE
        int contador =0;
        while(contador<15){
            System.out.println("Contador: "+ contador);
            contador++;
        }
        // FOR
        for(int i=0;i<15;i++){
            if(i%2 ==0){
                System.out.println("Valor de i: "+i);
            }

        }
         */
    }

}
