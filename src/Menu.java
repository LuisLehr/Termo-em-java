import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    int op = 1;

    public void menu() {
        System.out.println("");
        System.out.println("|--------------------------------------|");
        System.out.println("|           Termo Pirata V1.0          |");
        System.out.println("|--------------------------------------|");
        System.out.println("|  COMO JOGAR:                         |");
        System.out.println("|                                      |");
        System.out.println("|  - Digite uma palavra de 5 letras    |");
        System.out.println("|  - Digite as palavras sem acento     |");
        System.out.println("|  - Voce tem 6 tentativas             |");
        System.out.println("|                                      |");
        System.out.println("|  CORES:                              |");
        System.out.println("|  VERDE = letra no lugar certo        |");
        System.out.println("|  AMARELO = letra existe, lugar errado|");
        System.out.println("|  CINZA = letra nao existe            |");
        System.out.println("|--------------------------------------|");
        System.out.println("");
        System.out.println("Escolha uma das opcoes abaixo");
        System.out.println("1 - Novo Jogo");
        System.out.println("3 - Sair ");
        System.out.print("Digite a opcao escolhida: ");
    }

    public void alternativas() {
        System.out.println(" ");
        System.out.println("|------------------|");
        System.out.println("|      OPCOES      |");
        System.out.println("|------------------|");
        System.out.println("| 1 -     |");
        System.out.println("| 2 - Ler as regras|");
        System.out.println("| 3 - Sair         |");
        System.out.println("|------------------|");
        System.out.println(" ");

    }

    public void alternativasInvalidas() {
        System.out.println(" ");
        System.out.println("---------OPCAO INVALIDA!---------");
        System.out.println("Selecione uma das opções abaixo:");
        System.out.println(" 1 - Novo jogo");
        System.out.println(" 2 - Ler as regras ");
        System.out.println(" 3 - Sair");
        System.out.println(" ");

    }

    public void boasVindas() {
        System.out.println("");
        System.out.println("Escolha uma das opcoes abaixo:");
        System.out.println("1 - Iniciar jogo");
        System.out.println("2 - Ler as regras");
        System.out.println("3 - Sair");
    }
}
