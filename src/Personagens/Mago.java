package Personagens;

import Armas.ConjuracaoDeMagia_IF;
import Armas.Magia;

public class Mago extends Personagem implements ConjuracaoDeMagia_IF {
    private final Magia magia;

    public Mago(Magia magia) {
        super("Mago", 30); // Passando o nome e a idade para o construtor da classe Personagem
        this.magia = magia; // Armazenando a referência da Magia
    }

    @Override
    public void desenhar() {
        // implementação do método desenhar para Mago
    }

    @Override
    public void falar() {

    }

    @Override
    public void correr() {

    }

    public void usarMagia() {
        magia.conjurarMagia();
    }

    @Override
    public void conjurarMagia() {
        usarMagia(); // Chama o método usarMagia() para conjurar a magia
    }
}
