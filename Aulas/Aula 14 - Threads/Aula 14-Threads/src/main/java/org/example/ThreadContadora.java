package org.example;

public class ThreadContadora implements Runnable{
    // Atributos da classe de Thread
    private String nome;
    private int id;

    ThreadContadora (String nome, int id){
        // Construtor
        this.nome = nome;
        this.id = id;
    }

    // Método que permite operar a classe como uma thread
    @Override
    public void run(){
        // Lógica responsável por contar  de 0 a 100
        for (int i = 0; i < 100; i++) {
            System.out.println("NOME DA THREAD: "+this.nome+" ID: "+this.id);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("CONTAGEM: "+i);
        }
    }
}
