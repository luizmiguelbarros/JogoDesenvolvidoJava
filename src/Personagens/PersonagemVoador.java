package Personagens;

import Armas.ArmaDeFogo_IF;

public abstract class PersonagemVoador extends Personagem implements Voar_IF {
    public PersonagemVoador(ArmaDeFogo_IF arma) {
        super(arma);
    }

    public abstract void voar();
}
