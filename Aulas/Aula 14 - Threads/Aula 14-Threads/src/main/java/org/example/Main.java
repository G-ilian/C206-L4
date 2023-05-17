package org.example;

public class Main {
    public static void main(String[] args) {

        // Instanciando três threads contadoras - Interface
        ThreadContadora tc1 = new ThreadContadora("Thread 1",1);
        ThreadContadora tc2 = new ThreadContadora("Thread 2",3);
        ThreadContadora tc3 = new ThreadContadora("Thread 3",3);

        // Criar três objetos do tipo Thread
        Thread t1 = new Thread(tc1);
        Thread t2 = new Thread(tc2);
        Thread t3 = new Thread(tc3);

        // Executar as threads
        t1.start();
        t2.start();
        t3.start();
        /*HERANÇA
        // Instanciando três threads contadoras
        ThreadContadora t1 = new ThreadContadora("Thread 1",1);
        ThreadContadora t2 = new ThreadContadora("Thread 2",3);
        ThreadContadora t3 = new ThreadContadora("Thread 3",3);

        // Executar as threads
        t1.start();
        t2.start();
        t3.start();
        */

    }
}