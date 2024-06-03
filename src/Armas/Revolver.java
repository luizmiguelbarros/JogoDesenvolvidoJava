package Armas;

    public class Revolver extends Fuzil implements ArmaDeFogo_IF {
        @Override
        public void usarArma() {
            System.out.println("Usando revolver, quer um tiro no pé ou na mão?");
        }

        @java.lang.Override
        public void atirar() {

        }

        @java.lang.Override
        public void recarregar() {

        }
    }

