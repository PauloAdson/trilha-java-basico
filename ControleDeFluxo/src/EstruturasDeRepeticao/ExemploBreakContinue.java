package EstruturasDeRepeticao;
// break interrompe o laço
// continue interrompe somente a iteração atual
public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if (numero == 3) {
                continue; // break vai interromper o laço
            }
            System.out.println(numero);
        }
    }
}
