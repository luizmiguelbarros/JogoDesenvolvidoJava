package Personagens;

import Armas.Fuzil;

public class Soldado extends Personagem {
    public Soldado(Fuzil arma) {
        super(arma);
    }

    @Override
    public void desenhar() {
        // implementação do método desenhar para Soldado
    }

    @Override
    public void falar() {

    }

    @Override
    public void correr() {

    }

    private Fuzil Faca;
    Soldado soldado = new Soldado(Faca);

}
