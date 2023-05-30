package org.example;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Método que serve para escrever no Arquivo
    public void escrever(Livro livro){
        // Instanciando os objetos que permitirão a escrita de dados
        OutputStream os=null;
        OutputStreamWriter osw=null;
        BufferedWriter bw=null;


        try{
            // Abrindo a saída de dados
            os=new FileOutputStream("livros.txt",true); // Nome do arquivo onde será salvo
            osw=new OutputStreamWriter(os);
            bw= new BufferedWriter(osw);

            // Flag que indica onde começa as informações do Funcionário
            bw.write("++ LIVRO ++\n");
            bw.write(livro.getNome()+"\n");
            bw.write(livro.getEditora()+"\n");
            bw.write(livro.getAutor()+"\n");
            bw.write(livro.getQtdPaginas()+"\n");

        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            // Fechando a entrada de dados
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Livro> ler(){
        ArrayList<Livro> livrosEncontrados = new ArrayList<>();
        // Classes que permitem leitura de dados do arquivo
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;

        // Variável auxiliar que servirá de flag para o while
        String linhaLer;

        try{
            // Instanciando os objetos
            is=new FileInputStream("livros.txt");
            isr=new InputStreamReader(is);
            br=new BufferedReader(isr);

            // Colocando o cursor no inicio do arquivo
            linhaLer=br.readLine();

            while(linhaLer!=null){
                // Comparando se o que está em linhaLer é igual a minha flag
                if(linhaLer.contains("++ LIVRO ++")){
                    // Variável auxiliar de filme
                    Livro livroAux=new Livro();

                    // Criando um objeto do tipo livro com as variáveis auxiliares
                    livroAux.setNome(br.readLine());
                    livroAux.setEditora(br.readLine());
                    livroAux.setAutor(br.readLine());
                    // Para a quantidade de páginas é necessária fazer a conversão de String para Int
                    livroAux.setQtdPaginas(Integer.parseInt(br.readLine())); // Conversão

                    // Adicionando o livro no array de livros
                    livrosEncontrados.add(livroAux);
                }
                linhaLer=br.readLine();
            }


        }catch(Exception e){
            System.out.println("ERRO: "+e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("ERRO: "+e);
            }
        }
        return livrosEncontrados;
    }
}
