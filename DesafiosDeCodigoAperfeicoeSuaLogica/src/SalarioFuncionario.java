import java.util.Scanner;

public class SalarioFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salario do funcionario");
        float salarioBruto = scanner.nextFloat();
        System.out.println("valor dos benefícios do funcionário");
        float adcionalBeneficios = scanner.nextFloat();
        scanner.close();
        float imposto = 0;

        if (salarioBruto >= 0 && salarioBruto <= 1100.00) {
            imposto = 5;
        } else if (salarioBruto > 1100.00 && salarioBruto <= 2500.00) {
            imposto = 10;
        } else {
            imposto = 15;
        }

        float calculoPorcentagem = (imposto / 100) * salarioBruto;
        imposto = calculoPorcentagem;
        float salario = salarioBruto - imposto + adcionalBeneficios;
        System.out.println(salario);

    }
}