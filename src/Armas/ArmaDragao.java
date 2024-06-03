package Armas;
import java.util.Random;

public class ArmaDragao implements ArmaDeFogo_IF {
    @Override
    public void atirar() {

    }

    @Override
    public void recarregar() {

    }

    public int calcularDano() {
        Random random = new Random();
        int dano = random.nextInt(31);
        return dano;
    }

    public void usarArma() {
        int dano = calcularDano();
        System.out.println("Usar Bola de Fogo!");
        System.out.println("Dano causado: " + dano);
    }
}
