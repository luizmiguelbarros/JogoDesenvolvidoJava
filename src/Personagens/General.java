package Personagens;

import Armas.ArmaDeFogo_IF;

public class General extends Personagem {
    public General(ArmaDeFogo_IF arma) {
        super(arma);
    }

    @Override
    public void desenhar() {
        // implementação do método desenhar para General
    }

    @Override
    public void falar() {

    }
    private ArmaDeFogo_IF Faca;
    General general = new General(Faca);

    public void correr() {
        System.out.println("O soldado está correndo!");
    }

}
