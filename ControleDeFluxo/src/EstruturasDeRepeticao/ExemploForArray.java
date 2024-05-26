package EstruturasDeRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays o indice inicia em ZERO
        String alunos[] = { "PAULO", "FELIPE", "JONAS", "JULIA" };

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno do indice x=" + x + " é " + alunos[x]);
        }
    }
}
