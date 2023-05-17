import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Menu interativo para permitir o usuário a adicionar as informações de maneira dinâmica

        // Criando um Carrinho de Compras
        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        // Entrada de dados
        Scanner sc=new Scanner(System.in);
        // Flag de controle do while
        boolean flag=true;

        // Criando o menu
        while(flag){
            // Opções do menu
            System.out.println("BEM VINDO AO MENU");
            System.out.println("1- Comprar Biscoitos");
            System.out.println("2- Finalizar a compra");
            System.out.println("3- Sair");
            System.out.println("Entre com a sua opção: ");
            int opcao=sc.nextInt(); // Entrada de opção do usuário
            sc.nextLine();
            switch(opcao){
                case 1:
                    // Criando e adicionando Biscoitos ao carrinho
                    Biscoito bisc = new Biscoito();
                    System.out.print("NOME: ");
                    bisc.setNome(sc.nextLine());
                    System.out.print("SABOR: ");
                    bisc.setSabor(sc.nextLine());
                    System.out.print("VALOR R$: ");
                    bisc.setValor(sc.nextDouble());
                    System.out.print("QUANTIDADE: ");
                    bisc.setQtd(sc.nextInt());

                    // Adicionando o biscoito
                    carrinho.addBiscoitos(bisc);
                    break;
                case 2:
                    // Ao finalizar a compra temos que validar informar o valor do cupom de desconto
                    System.out.print("VALOR CUPOM DE DESCONTO: ");
                    carrinho.getCupom().setValor(sc.nextDouble());

                    // Calculando o valor total
                    double valorTotal = carrinho.somaTotal();
                    System.out.println("VALOR TOTAL COMPRA: "+valorTotal+" R$");
                    break;
                case 3:
                    flag=false;
                    break;
                default:
                    System.out.println("Opção Inválida !!!");
                    break;
            }
        }
        sc.close(); // Fechando a entrada de dados após utiliza-la
    }
}
