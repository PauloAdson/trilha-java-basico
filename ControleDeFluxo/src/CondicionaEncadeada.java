// nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.

public class CondicionaEncadeada {
    public static void main(String[] args) {
        double nota = 8;

        if (nota >= 7) {
            System.out.println("Aluno aprovado com a nota " + nota);
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno de recuperação com a nota " + nota);
        } else
            System.out.println("Aluno reprovado com a nota " + nota);
    }
}
