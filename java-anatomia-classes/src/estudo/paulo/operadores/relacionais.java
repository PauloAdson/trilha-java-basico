package estudo.paulo.operadores;

public class relacionais {
    public static void main(String[] args) {
        String nomeUm = "PAULO";
        String nomeDois = new String("PAULO");

        System.out.println(nomeUm.equals(nomeDois)); // ao utilizar objetos, é interessante usar o equals para ver se é igual ou não

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("Essa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente do numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que o numeroDois? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numeroUm é maior ou igual ao numeroDois? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor que o numeroDois? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numeroUm é menor ou igual ao numeroDois? " + simNao);
    }
}
