import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        // Exercício IMC - Proposto Aula
        Scanner entrada=new Scanner(System.in); // Variável para entrada de dados

        System.out.println("Entre com o seu peso: ");
        float peso=entrada.nextFloat();// Varíável para peso

        System.out.println("Entre com a sua altura: ");
        float altura=entrada.nextFloat(); // Varíável para altura

        float imc; // Variável para armazenar o cálculo do imc

        imc=peso/(altura*altura); // Cálculo do imc

        System.out.println("IMC: "+imc);
        if(imc<=18.5){
            System.out.println("Abaixo do peso!");
        }else if(imc<24.9){
            System.out.println("Peso normal!");
        }else if(imc<29.9){
            System.out.println("Sobrepeso!");
        }else if(imc<34.9){
            System.out.println("Obesidade grau 1!");
        }else if(imc<39.9){
            System.out.println("Obesidade grau 2!");
        }else{
            System.out.println("Obesidade grau 3!");
        }
    }
    }
}
