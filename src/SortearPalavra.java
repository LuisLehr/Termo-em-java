
//Imports
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class SortearPalavra {

    private String palavraSorteada;

    public void sortear() {

        String caminhoArquivo = "palavras.txt";
        
        // Criando Lista
        List<String> palavras = new ArrayList<>();

        // Iniciando o Random para selecionar palavras
        Random aleatorio = new Random();


        try {
            // Lendo todas as linhas e guardando na lista
            palavras = Files.readAllLines(Paths.get(caminhoArquivo));    

            // Limpando as palavras, tirando espaçoes, linhas vazias e etc
            List<String> palavrasLimpas = palavras.stream()
                .map(String::trim)
                .filter(p -> !p.isEmpty())
                .collect(Collectors.toList());

            // Selecionando um indice existente dentro da lista de palavras
            int indiceAleatorio = aleatorio.nextInt(palavrasLimpas.size());

            // Selecionando a palavra
            palavraSorteada = palavrasLimpas.get(indiceAleatorio);

            // Tirando acentos das palavras
            palavraSorteada = Utils.removerAcentos(palavraSorteada).toUpperCase();
        } 

         catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getPalavraSorteada(){
        return palavraSorteada;
    }
}
