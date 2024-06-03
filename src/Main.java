import java.util.Scanner;

import Armas.ArmaDeFogo_IF;
import Armas.Revolver;
import Armas.Magia;
import Armas.ArmaDragao;
import Armas.*;
import Personagens.*;

class Jogo {
    public static void main(String[] args) {

        System.out.println("///////Você está frente à frente contra o chefe final do jogo com a melhor lógica de programação existente no mundo///////");
        System.out.println("Selecione um personagem:");
        System.out.println("1. Dragão Alado");
        System.out.println("2. Soldado");
        System.out.println("3. General");
        System.out.println("4. LutSUMO");
        System.out.println("5. Mago");

        Scanner scanner = new Scanner(System.in);

        int escolha = scanner.nextInt();

        Personagem personagem = null;

        switch (escolha) {
            case 1:
                personagem = new DragaoAlado(new ArmaDragao()) {
                    @Override
                    public void recarregar() {

                    }

                    @Override
                    public void usarArma() {

                    }

                    @Override
                    public void correr() {

                    }
                };
                break;
            case 2:
                personagem = new Soldado(new Revolver());
                break;
            case 3:
                personagem = new General(new Fuzil());
                break;
            case 4:
                personagem = new LutSUMO(new Desarmado());
                break;
            case 5:
                personagem = new Mago(new Magia());
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Você escolheu: " + personagem.getClass().getSimpleName());

        while (true) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Atacar");
            System.out.println("2. Correr");
            System.out.println("3. Voar (se aplicável)");
            System.out.println("4. Trocar arma");

            int acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    personagem.atirar();
                    break;
                case 2:
                    personagem.correr();
                    break;
                case 3:
                    if (personagem instanceof Voar_IF) {
                        ((Voar_IF) personagem).voar();
                    } else {
                        System.out.println("Este personagem não pode voar!");
                    }
                    break;
                case 4:
                    System.out.println("Selecione uma arma:");
                    System.out.println("1. Revolver");
                    System.out.println("2. Fuzil");
                    System.out.println("3. Desarmado");
                    System.out.println("4. Magia");
                    System.out.println("5. Fogo");

                    int armaEscolhida = scanner.nextInt();

                    ArmaDeFogo_IF arma = null;

                    switch (armaEscolhida) {
                        case 1:
                            arma = new Revolver();
                            break;
                        case 2:
                            arma = new Fuzil();
                            break;

                        case 3:
                            arma = new Magia();
                            break;
                        case 4:
                            arma = new ArmaDragao();
                            break;
                        default:
                            System.out.println("Opção inválida!");
                            return;
                    }

                    personagem.setArma(arma);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return;
            }
        }
    }
}