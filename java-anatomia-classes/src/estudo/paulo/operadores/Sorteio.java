package estudo.paulo.operadores;

import java.util.Random;

public class Sorteio {

    public static void main(String[] args) {
        // Array contendo os nomes
        String[] nomes = {"Paulo", "Gisele"};

        // Gerando um índice aleatório
        Random random = new Random();
        int indiceSorteado = random.nextInt(nomes.length);

        // Obtendo o nome sorteado
        String nomeSorteado = nomes[indiceSorteado];

        // Exibindo o nome sorteado
        System.out.println("O nome sorteado é: " + nomeSorteado);
    }
}