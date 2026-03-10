import java.util.Scanner;

public class leitorDePalavras {

    // Iniciando o Scanner
    Scanner scanner = new Scanner(System.in);

    String palavraJogador = "";

    public void executar() {

        System.out.print("Digite uma palavra: ");

        // Guardando a palavra e limpando ela
        palavraJogador = scanner.next().trim().toUpperCase();

        while (palavraJogador.length() < 5 || palavraJogador.length() > 5) {

            // Pedindo a palavra para o jogador novamente
            System.out.println("");
            System.out.println("=============== ATENCAO! ===============");
            System.out.println("Digite apenas palavras com CINCO letras!");
            System.out.println("========================================");
            System.out.print("Digite uma palavra: ");

            // Guardando a palavra e limpando ela
            palavraJogador = scanner.next().trim().toUpperCase();
        }

        // Removendo acentos da palavra do jogador
        palavraJogador = Utils.removerAcentos(palavraJogador).trim().toUpperCase();
    }

    public String getPalavraJogador() {
        return palavraJogador;
    }
}
