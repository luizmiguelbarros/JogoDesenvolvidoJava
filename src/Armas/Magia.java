package Armas;
import java.util.Random;

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
    public int calcularDano() {
        Random random = new Random();
        int dano = random.nextInt(31);
        return dano;
    }

    public void usarArma() {
        int dano = calcularDano();
        System.out.println("Usar Magia!");
        System.out.println("Dano causado: " + dano);
    }
}

