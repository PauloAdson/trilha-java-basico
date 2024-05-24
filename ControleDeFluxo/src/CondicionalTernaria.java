//refatorando o esle if com o conceito de operador ternário.
//<Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>

public class CondicionalTernaria {
    public static void main(String[] args) {
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado com a nota " + nota : "Reprovado com a nota " + nota;
        System.out.println(resultado);

        // com o uso do "else if"
        int nota2 = 4;

        String resultado2 = nota2 >= 7 ? "Aprovado com a nota " + nota2
                : nota2 >= 5 && nota2 < 7 ? "Recuperação com a nota " + nota2 : "Reprovado com a nota " + nota2;
        System.out.println(resultado2);
    }
}
