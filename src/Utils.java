import java.text.Normalizer;

public class Utils {
    // Método para remover o acentos das palavras
    public static String removerAcentos(String texto) {
        if (texto == null) return "";
            

        return Normalizer.normalize(texto, Normalizer.Form.NFD)
            .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

}
