public class Main {
    public static void main(String[] args) {
        // Array de primitivos
        // char, float, double, int
        char [] arrayDeChars;
        int []arrayDeInts= {0,1,2,3,4,5,6}; // Array preenchido
        int []arrayDeFloat;
        int []arrayDeDouble;

        // Array de referências para objetos
        String []arrayDeStrings;

        // Mostrando uma posição do array
        System.out.println("2ª Posição array de inteiros: "+arrayDeInts[1]);

        // Mostrando todas as posições do array
        /*
        for (int i = 0; i < arrayDeInts.length ; i++) {
            System.out.println("Valor posição ["+i+"] é = "+arrayDeInts[i]);
        }
        */

        // Criando um arrray de referência para contas
        Conta [] contas = new Conta[5];

        // Criando contas
        Conta c1 = new Conta(234.56f,"3452-0");
        Conta c2 = new Conta(1300.45f,"9090-8");


        // Criando um titular
        Titular titular1=new Titular();
        titular1.nome="Gabriel";

        c1.addTitular(titular1);

        // Atribuindo contas as posições do array
        contas[0]=c1;
        contas[1]=c2;


        for (int i = 0; i < contas.length; i++) {
            if(contas[i]!=null){
                contas[i].mostraInfos();
            }



        }



    }
}
