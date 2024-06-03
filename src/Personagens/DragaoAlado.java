package Personagens;

import Armas.ArmaDeFogo_IF;

public abstract class DragaoAlado extends PersonagemVoador implements ArmaDeFogo_IF {
    public DragaoAlado(ArmaDeFogo_IF arma) {
        super(arma);
    }

    @Override
    public void desenhar() {
        // Implementação do método desenhar para DragaoAlado
    }

    @Override
    public void voar() {
        System.out.println("O dragão alado está voando!");
    }

    @Override
    public void falar() {
        // Implementação do método falar para DragaoAlado (opcional, dependendo da sua necessidade)
    }

    @Override
    public void setArma(ArmaDeFogo_IF arma) {
        this.setArma(arma);
    }

    @Override
    public ArmaDeFogo_IF getArma() {
        return this.getArma();
    }
}
