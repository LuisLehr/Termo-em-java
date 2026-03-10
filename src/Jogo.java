// Import
import java.util.Scanner;

public class Jogo {

    public void jogar() {

        // Iniciando o Scanner
        Scanner Teclado = new Scanner(System.in);

        while (true) {
            int op = 1;
            int tentativas = 1; // reseta a cada novo jogo
            boolean venceu = false;

            System.out.println("");
            System.out.println("BOM JOGO!");

            SortearPalavra sortearPalavra = new SortearPalavra();
            sortearPalavra.sortear();

            while (tentativas <= 6) {

                if (tentativas < 6) {
                    System.out.println("");
                    System.out.println("Tentativa " + tentativas);
                } else {
                    System.out.println("");
                    System.out.println("Sua ultima tentativa!");
                }

                leitorDePalavras leitorDePalavras = new leitorDePalavras();
                leitorDePalavras.executar();

                ComparadorDePalavras comparador = new ComparadorDePalavras(sortearPalavra, leitorDePalavras);
                Resultado[] resultados = comparador.comparar();
                comparador.ImprimirResultados(resultados);

                // Verifica vitória
                boolean acertou = true;
                for (Resultado r : resultados) {
                    if (r != Resultado.CORRETA) {
                        acertou = false;
                        break;
                    }
                }

                if (acertou) {
                    System.out.println("\nParabens! Voce acertou!");
                    venceu = true;
                    break;
                }

                tentativas++;
            }

            if (!venceu) {
                System.out.println("\nGame over! A palavra era: " + sortearPalavra.getPalavraSorteada());
            }

            // Menu de alternativas para o jogador
            System.out.println("");
            System.out.println("------ OPCOES ------");
            System.out.println("1 - Novo Jogo");
            System.out.println("2 - Sair para o menu");
            System.out.print("Digite a opcao escolhida: ");
            op = Teclado.nextInt();


            if (op != 1) {
                break;
            }
        }
    }
}
