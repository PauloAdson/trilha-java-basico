package estudo.paulo.operadores;

// tabela verdade
public class logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        // && E
        if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }
        // && E
        if (condicao1 && (7 > 6)) {
            System.out.println("As duas condições são verdadeiras");
        }
        
        // || OU
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeiras");
        }
        System.out.println("FIM!");
    }
}
