// Condicional composta é executada de uma forma quando for verdadeira e de outra forma quando ela for falsa
public class CondicionalComposta {
    public static void main(String[] args) {
        int nota = 7;

        if (nota >= 7)
            System.out.println("Aprovado com a nota " + nota);

        else
            System.out.println("Reprovado com a nota " + nota);

        // Caixa eletronico
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado <= saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("O seu saldo agora é R$ " + saldo + ".");
        } else
            System.out.println("Saldo insuficiente. O Seu saldo é R$ " + saldo + ".");
    }
}
