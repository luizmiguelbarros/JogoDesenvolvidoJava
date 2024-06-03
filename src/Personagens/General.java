package Personagens;

import Armas.ArmaDeFogo_IF;

public class General extends Personagem {
    public General(ArmaDeFogo_IF arma) {
        super(arma);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um General");
    }

    @Override
    public void falar() {
        System.out.println("Avante guerreiros!!!");
    }
    private ArmaDeFogo_IF Faca;
    General general = new General(Faca);

    public void correr() {
        System.out.println("Correndo...");
    }

}
