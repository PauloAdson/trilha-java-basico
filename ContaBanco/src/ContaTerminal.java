import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu primeiro nome.");
        String nomeCliente = scanner.next();
        System.out.println("Digite seu último nome.");
        String ultimoNomeCliente = scanner.next();

        System.out.println("Digite o número da Agência. Exemplo: 000-0");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta. Exemplo: 0000");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite o seu saldo");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("Olá " + nomeCliente + " "+ ultimoNomeCliente + ", obrigado por criar uma conta em nosso banco Santander, sua agência é "
                + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
