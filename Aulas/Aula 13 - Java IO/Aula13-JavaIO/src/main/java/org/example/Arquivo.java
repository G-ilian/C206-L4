package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escreverArquivo(Funcionario func){
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        try {
            // Recebe o nome do meu arquivo
            os = new FileOutputStream("Funcionarios.txt",true);

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Efetivamente escrevendo no arquivo
            bw.write("++ FUNCIONARIO ++\n");
            bw.write(func.getNome()+"\n");
            bw.write(func.getSalario()+"\n");
            bw.write(func.getIdade()+"\n");


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public ArrayList<Funcionario> lerArquivos(){
        // Criando array list que armazena os funcionários encontrados no arquivo
        ArrayList<Funcionario> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try{
            is = new FileInputStream("Funcionarios.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);


            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while(linhaLer!=null){
                // Verificando se já estamos na estrutura de um funcionário
                if(linhaLer.contains("++ FUNCIONARIO ++")){

                    // Preenchendo as informações do funcionário
                    String nome = br.readLine();
                    double salario = Double.parseDouble(br.readLine());
                    int idade = Integer.parseInt(br.readLine());

                    // Criando um objeto auxiliar de funcionario
                    Funcionario auxFuncionario = new Funcionario(nome,salario,idade);

                    // Adicionando o funcionário ao arrayList, para informar que encontrei o funcionário
                    encontreiNoArquivo.add(auxFuncionario);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        }catch (Exception e){

        }
        return encontreiNoArquivo;
    }
}
