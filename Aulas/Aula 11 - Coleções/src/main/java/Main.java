import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // ArrayList - É uma estrutura dinâmica
        ArrayList listaHeterogenea = new ArrayList(); // Heterogenea
        ArrayList <Integer> listaDeInteiros = new ArrayList<>(); // Homogenea
        ArrayList <Funcionario> funcionarios = new ArrayList<>(); // Objetos

        // Criando 3 funcionarios
        Funcionario func1 = new Funcionario("Artur",21,590.4f);
        Funcionario func2 = new Funcionario("Ramon",22,1200.4f);
        Funcionario func3 = new Funcionario("Pedro",20,10000.4f);

        // Adicionando os funcionários
        funcionarios.add(func2);
        funcionarios.add(func3);
        funcionarios.add(func1);
        System.out.println("Antes de ordenar : ");
        // Listando os funcionários
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("NOME: "+funcionarios.get(i).getNome()
                    +" IDADE: "+funcionarios.get(i).getIdade()+" SALARIO: "+funcionarios.get(i).getSalario());
        }

        // Ordenando os funcionários para apresentar as informações
        Collections.sort(funcionarios);
        Collections.reverse(funcionarios);
        System.out.println("Depois de ordenar: ");
        // Listando os funcionários
        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("NOME: "+funcionarios.get(i).getNome()
                    +" IDADE: "+funcionarios.get(i).getIdade()+" SALARIO: "+funcionarios.get(i).getSalario());
        }


        /*
        // Adicionando itens a minha estrutura de inteiros
        listaDeInteiros.add(2);
        listaDeInteiros.add(50);
        listaDeInteiros.add(3);
        listaDeInteiros.add(5);
        listaDeInteiros.add(2);

        // Adicionando itens a minha estrutura
        listaHeterogenea.add(2);
        listaHeterogenea.add(true);
        listaHeterogenea.add("Gabriel");
        listaHeterogenea.add('A');

        // Imprindo itens - Forma I
        System.out.println(listaHeterogenea);

        // Imprindo itens - Forma II
        System.out.println("LISTA DE INTEIROS ANTES DE ORDENAR");
        for (int i = 0; i < listaDeInteiros.size(); i++) {
            System.out.println("DADOS : "+listaDeInteiros.get(i));

        }
        Collections.sort(listaDeInteiros); // Ordenando os itens
        Collections.reverse(listaDeInteiros); // Revertendo a lista - Ordenando de forma decrescente
        System.out.println("LISTA DE INTEIROS ANTES DEPOIS ORDENAR");
        for (int i = 0; i < listaDeInteiros.size(); i++) {
            System.out.println("DADOS : "+listaDeInteiros.get(i));

        }
        // Hash Map - Trabalha com o conceito de chave valor
        // Chave : Valor
        HashMap<String,Integer> idadesAlunos = new HashMap();
        // Adicionar dados
        idadesAlunos.put("Ramon",22);
        idadesAlunos.put("Artur",24);
        // Removendo itens
        idadesAlunos.remove("Ramon");

        // Imprimir os valores
        idadesAlunos.forEach((key,value)->{
            System.out.println("CHAVE: "+key+" VALOR: "+value);
        });

        // Hash Set -> Não aceita valores duplicados
        HashSet <Integer> idades = new HashSet();

        // Adicionando os itens na estrutura
        idades.add(2);
        idades.add(3);
        idades.add(4);
        idades.add(5);
        idades.add(2);

        // Imprimindo os valores
        System.out.println(idades);
         */
    }


}
