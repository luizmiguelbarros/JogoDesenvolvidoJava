package Armas;

public class Desarmado implements ArmaDeFogo_IF {
    @Override
    public void atirar() {

    }

    @Override
    public void recarregar() {

    }

    @Override
    public int calcularDano() {
        return 0;
    }

    @Override
    public void usarArma() {
        System.out.println("Não está armado");
    }
}
