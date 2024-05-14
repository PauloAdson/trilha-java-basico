package estudo.paulo.operadores;

public class ternario {
    public static void main(String[] args) {
        int a, b, c, d;
        a = 5;
        b = 6;
        c = 1;
        d = 1;

        String resultado = "";

        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        
        String resultado2 = c == d ? "verdadeiro" : "falso";
        System.out.println(resultado2);

    }
}
