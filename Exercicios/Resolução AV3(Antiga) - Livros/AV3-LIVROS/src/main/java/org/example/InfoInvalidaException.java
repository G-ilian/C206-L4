package org.example;

public class InfoInvalidaException extends Exception{

    public InfoInvalidaException(String mensagemInformativa) {
        System.out.println(mensagemInformativa);
    }
}
