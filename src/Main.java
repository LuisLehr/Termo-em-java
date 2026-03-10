// Imports
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.setOut(new PrintStream(System.out, true, "UTF-8"));

        int op = 1;

        Scanner Teclado = new Scanner(System.in);

        // Mensagem de boas vindas e escolhas
        System.out.println("");
        System.out.println("=== Seja bem vindo ao Termo Pirata V1.0! ===");
        Menu menu = new Menu();
        menu.boasVindas();
        System.out.print("Digite a opcao escolhida: ");
        op = Teclado.nextInt();

        // Loop para verificação das opções
        while (op > 0 && op < 4) {

            // Loop para verificar se a opção é válida
            while (op < 1 || op > 3) {
                menu.alternativasInvalidas();
                System.out.print("Digite a opcao escolhida: ");
                op = Teclado.nextInt();
            }

            // Switch case com as opções do menu e do jogo
            switch (op) {

                case 1:
                    Jogo jogo = new Jogo();
                    jogo.jogar();
                    break;

                case 2:
                    menu.menu();
                    op = Teclado.nextInt();
                    break;

                case 3:
                    break;
            }

            if (op == 3) {
                System.out.println("");
                System.out.println("----------------------------------");
                System.out.println("  Programa Finalizado, Ate Mais! ");
                System.out.println("----------------------------------");
                break;
            }
        }
    }
}
