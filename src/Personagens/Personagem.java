package Personagens;

import Armas.ArmaDeFogo_IF;
import Armas.ConjuracaoDeMagia_IF;


public abstract class Personagem implements Correr_IF {
    private ArmaDeFogo_IF arma;

    public Personagem(ArmaDeFogo_IF arma) {
        this.arma = arma;
    }

    public Personagem(String mago, int i) {
    }

    public ArmaDeFogo_IF getArma() {
        return arma;
    }

    public void setArma(ArmaDeFogo_IF arma) {
        this.arma = arma;
    }

    public abstract void desenhar();
    public abstract void falar();
    public abstract void correr(); // novo método correr()

    public void atirar() {
    }
}
