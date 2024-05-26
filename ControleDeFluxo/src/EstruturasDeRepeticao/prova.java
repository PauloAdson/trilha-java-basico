package EstruturasDeRepeticao;

public class prova {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            if (x % 2 == 0) // % operador que representa módulo de uma divisão
                System.out.println(x);
        }

        boolean condicao = false;

        while (condicao) {
            System.out.println("executou ... ");
        }
        int num = 5, count = 1;
        do {
            num += count;
            System.out.println(num);
            // count++; ////solução do loop
        } while (count <= 3);

        String[] nomes = { "Camila", "Venilton", "Leonardo", "Renan", "Rafael" };
        System.out.print(nomes.length);
    }
}
