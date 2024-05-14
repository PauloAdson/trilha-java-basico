package estudo.paulo.operadores;

public class incrementoDeValores {
    public static void main(String[] args) {
        int numero = 5;
        // x repetições
        numero = numero + 2;
        System.out.println(numero + " incrementando +2");

        int numero2 = 5;
        numero2 ++;
        System.out.println(numero2 + " numero2 incrementando");
        System.out.println(++ numero2 + " numero2 incrementando");

        int numero3 = 5;
        System.out.println(-- numero3 + " decremento");
         // unario logico de negacao
        boolean variavel = true;
        System.out.println(!variavel + " trocando o valor para false");
        variavel = !variavel;
        System.out.println(!variavel + " trocando o valor para true");
    }
}
