
public class ComparadorDePalavras {

    // Vinculando cores a alguns estados das letras
    private static final String VERDE = "\u001B[42m\u001B[1m";
    private static final String AMARELO = "\u001B[43m\u001B[1m";
    private static final String CINZA = "\u001B[100m\u001B[1m";
    private static final String RESET = "\u001B[0m";

    // Iniciando as variaveis
    private String jogo;
    private String jogador;

    public ComparadorDePalavras(SortearPalavra sorteio, leitorDePalavras leitura) {
        this.jogo = sorteio.getPalavraSorteada();
        this.jogador = leitura.getPalavraJogador();
    }

    public Resultado[] comparar() {

        Resultado[] resultados = new Resultado[5];
        char[] letrasJogo = jogo.toCharArray();

        // Primeira passagem: letras corretas
        for (int i = 0; i < 5; i++){
            if (jogador.charAt(i) == letrasJogo[i]) {
                resultados[i] = Resultado.CORRETA;
                letrasJogo[i] = '\0'; // Marca a letra como usada
            }
        }

        for (int i = 0; i < 5; i++) {
            if (resultados[i] != null) continue; // já classificada

            char letra = jogador.charAt(i);
            boolean encontrou = false;

            for (int j = 0; j < 5; j++) {
                if (letrasJogo[j] == letra) {
                    encontrou = true;
                    letrasJogo[j] = '\0'; // Marca a letra como usada
                    break;
                }
            }
            resultados[i] = encontrou ? Resultado.PRESENTE : Resultado.AUSENTE;
        }

        return resultados;
    }

    public void ImprimirResultados(Resultado[] resultados) {
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            String cor;
            switch (resultados[i]) {
                case CORRETA  -> cor = VERDE;
                case PRESENTE -> cor = AMARELO;
                default       -> cor = CINZA;
            }
            System.out.print(cor + " " + jogador.charAt(i) + " " + RESET);
        }
        System.out.println("");
    }
}
