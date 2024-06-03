package Armas;
import java.util.Random;

// Pacote armas
public class Faca implements ArmaDeFogo_IF {
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
        System.out.println("Usando faca AK47, a faca perfeita para o combate!");
        System.out.println("Dano causado: " + dano);
    }
}
