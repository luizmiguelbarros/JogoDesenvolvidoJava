package Armas;

public class Arma implements ArmaDeFogo_IF {
    private String nome;

    public Arma(String nome) {
        this.nome = nome;
    }

    @Override
    public void atirar() {
        System.out.println(nome + " disparou!");
    }

    @Override
    public void recarregar() {
        System.out.println(nome + " está sendo recarregado(a)...");
    }

    @Override
    public void usarArma() {

    }
}
