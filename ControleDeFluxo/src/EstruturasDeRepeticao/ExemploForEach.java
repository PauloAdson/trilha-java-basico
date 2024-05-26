package EstruturasDeRepeticao;

public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "PAULO", "FELIPE", "JONAS", "JULIA" };
        for (String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
