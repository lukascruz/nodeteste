package com.padaria;

/**
 * Created by Lucas Cruz on 26/11/2016.
 */
public class Main {

    public static void main(String args[]) {

        Pessoa joao = new Pessoa("João");
        joao.acordar();
//        joao.setCafe(new PaodeForno());
        joao.tomarCafe();

    }
}
