package Armas;

public class Magia implements ConjuracaoDeMagia_IF, ArmaDeFogo_IF {


    @Override
    public void conjurarMagia() {
        System.out.println("O mago implacável está conjurando magia");
    }

    @Override
    public void atirar() {

    }

    @Override
    public void recarregar() {

    }

    @Override
    public void usarArma() {

    }
}

