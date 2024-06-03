package Personagens;


import Armas.Desarmado;

public class LutSUMO extends Personagem {
    public LutSUMO(Desarmado arma) {
        super(arma);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Lutador");
    }

    @Override
    public void falar() {
        System.out.println("Eu sou o Dragão Guerreiro!!!");
    }

    public void atacar() {
        System.out.println("O lutador de sumô sentou em cima de seu adversário!!!");
    }
    public void correr() {
        System.out.println("O lutador de sumô está correndo, na medida que seu corpo permite!");
    }
}
