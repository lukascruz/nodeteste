package com.padaria;

/**
 * Created by Lucas Cruz on 26/11/2016.
 */
public class Pessoa {

    public String nome;
    public Comestivel cafe;

    public Pessoa(String nome, Comestivel cafe){
        this.nome = nome;
        this.cafe = cafe;
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void acordar(){
        System.out.println("Acordando...");
    }

    public void tomarCafe(){
        cafe.comer();
    }

    public void setCafe(Comestivel cafe) {
        this.cafe = cafe;
    }
}
