package Armas;
import java.util.Random;
    public class Revolver extends Fuzil implements ArmaDeFogo_IF {
        @Override
        public int calcularDano() {
            Random random = new Random();
            int dano = random.nextInt(31);
            return dano;
        }

        public void usarArma() {
            int dano = calcularDano();
            System.out.println("Usar Revolver!");
            System.out.println("Dano causado: " + dano);
        }


        @java.lang.Override
        public void atirar() {

        }

        @java.lang.Override
        public void recarregar() {

        }

    }

