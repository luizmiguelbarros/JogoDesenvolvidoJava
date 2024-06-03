package Personagens;

import Armas.Fuzil;

public class Soldado extends Personagem {
    public Soldado(Fuzil arma) {
        super(arma);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Soldado");
    }

    @Override
    public void falar() {
        System.out.println("Para cima deles!!!");
    }

    @Override
    public void correr() {
        System.out.println("Correndo...");
    }

    private Fuzil Faca;
    Soldado soldado = new Soldado(Faca);

}
